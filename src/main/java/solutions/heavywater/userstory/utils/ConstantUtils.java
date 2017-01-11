/**
 * Copyright (©) 2016, HeavyWater Solutions. All rights reserved.
 *
 * @author Name of the Author
 */
package solutions.heavywater.userstory.utils;

/**
 * <p>
 * ConstantUtils
 * </p>
 *
 * Following class will have all the string literals used in the Webservice.
 */
public class ConstantUtils {
	/* AWS console related keywords */
	public static final String STACK_NAME = "heavywater-SampleSkeletonWebservice";
	public static final String URL = "Url";
	public static final String STACK_STATUS_UNKNOWN = "Unknown";
	public static final String NO_SUCH_STACK = "NO_SUCH_STACK";

	/* file names for S3 Save */
	public static final String BUCKET_NAME = "commitacceptance-test-results";
	public static final String TIMESTAMP_FOLDER_NAME = "yyyy-MM-dd HH-mm-ss";
	public static final String TEST1_INPUT_FILE = "SampleSkeletonWebservice/%s/user-story-name/input/%s";
	public static final String TEST1_OUTPUT_FILE = "SampleSkeletonWebservice/%s/user-story-name/output/%s";
	public static final String TEMP_FOLDER = "/tmp/";
	public static final String INPUT_FILE_NAME = "input-file-name.txt";
	public static final String OUTPUT_FILE_NAME = "output-file-name.txt";
	public static final String DESCRIPTOR_FILE_NAME = "descriptor.txt";

	/* URL & bad file regex */
	public final static String BAD_LINE_REGEX = "\\b(https?|ftp|file|www)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
	public static final String OPTIMALBLUE_DOT_COM = "optimalblue.com";
	public static final String HEAVYWATER_DOT_SOLUTIONS = "heavywater.solutions";
	public static final String S3_DOT_AMAZONAWS_DOT_COM = "s3.amazonaws.com";
	public static final String SOAP = "soap";
	public static final String WWW_DOT_W3_DOT_ORG = "www.w3.org";

	/* File Extensions */
	public static final String DOT_JAVA_FILE = ".java";
	public static final String DOT_JS_FILE = ".js";
	public static final String DOT_TEMPLATE_FILE = ".template";

	/* Common String literals Used */
	public static final String BLANK = "";
	public static final String CONTENT_TYPE = "content-type";
	public static final String ACCEPT = "accept";
	public static final String ISO_8859_1 = "ISO-8859-1";
	public static final String UTF8 = "UTF8";
}
