FROM tomcat:8.0-jre8
FROM maven:3.2-jdk-8-onbuild
MAINTAINER "RAJ KUMAR DUBEY" (rajkumar.dubey@heavywater.solutions)
ADD /target/SampleSkeleton.war /usr/local/tomcat/webapps/
