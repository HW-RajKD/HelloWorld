FROM java:openjdk-7-jdk
FROM tomcat:8.0
FROM maven:3.2-jdk-7-onbuild
MAINTAINER "RAJ KUMAR DUBEY" (rajkumar.dubey@heavywater.solutions)
CMD ["mvn clean install"]
