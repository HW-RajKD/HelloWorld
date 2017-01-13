FROM tomcat:8.0-jdk8
MAINTAINER "RAJ KUMAR DUBEY" (rajkumar.dubey@heavywater.solutions)
ADD /target/SampleSkeleton.war /usr/local/tomcat/webapps/
