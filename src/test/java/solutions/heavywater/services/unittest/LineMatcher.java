/**
 * Copyright (©) 2016, HeavyWater Solutions. All rights reserved.
 *
 * @author Name of the Author
 */
package solutions.heavywater.services.unittest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import solutions.heavywater.userstory.utils.ConstantUtils;

/**
 * <p>
 * LineMatcher
 * </p>
 *
 * Following class search & test entire projects for bad line i.e., any hard coded url etc
 */
public final class LineMatcher {
	final static private Logger logger = Logger.getLogger(LineMatcher.class);

	public void findBadLines(String aFileName) {
		Matcher matcher = Pattern.compile(ConstantUtils.BAD_LINE_REGEX)
				.matcher(ConstantUtils.BLANK);
		Path path = Paths.get(aFileName);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING);
				LineNumberReader lineReader = new LineNumberReader(reader);) {
			String line = null;
			while ((line = lineReader.readLine()) != null) {
				matcher.reset(line.trim());
				if (matcher.find() && !(line.toLowerCase().contains(ConstantUtils.OPTIMALBLUE_DOT_COM)
						|| line.toLowerCase().contains(ConstantUtils.HEAVYWATER_DOT_SOLUTIONS)
						|| line.toLowerCase().contains(ConstantUtils.S3_DOT_AMAZONAWS_DOT_COM)
						|| line.toLowerCase().contains(ConstantUtils.SOAP)
						|| line.toLowerCase().contains(ConstantUtils.WWW_DOT_W3_DOT_ORG))) {
					throw new IllegalStateException(
							"Line " + lineReader.getLineNumber() + " contains hard-coded link: " + line.trim());
				}

			}
		} catch (final IOException exception) {
			logger.info(exception.getMessage());
		}
	}

	final static Charset ENCODING = StandardCharsets.UTF_8;

	public static List<File> listf(String directoryName) {
		LineMatcher lineMatcher = new LineMatcher();
		File directory = new File(directoryName);
		List<File> resultList = new ArrayList<File>();

		/* get all the files from a directory */
		File[] fList = directory.listFiles();
		resultList.addAll(Arrays.asList(fList));
		for (File file : fList) {
			if (file.isFile() && (file.getName().endsWith(ConstantUtils.DOT_JAVA_FILE)
					|| file.getName().endsWith(ConstantUtils.DOT_JS_FILE)
					|| file.getName().endsWith(ConstantUtils.DOT_TEMPLATE_FILE))) {
				lineMatcher.findBadLines(file.getAbsolutePath());
			} else if (file.isDirectory()) {
				resultList.addAll(listf(file.getAbsolutePath()));
			}
		}
		return resultList;
	}

	public static void main(String args[]) {
		try {
			File f = new File(args[0]);
			logger.info("FilePath=" + f.getAbsolutePath());
			BufferedReader brTest = new BufferedReader(new FileReader(f.getAbsolutePath()));
			listf(brTest.readLine());
			brTest.close();
			logger.info("Done.");
		} catch (final IOException exception) {
			logger.info(exception.getMessage());
		}
	}
}
