FROM tomcat:8.0
FROM java:openjdk-7-jdk
FROM maven:3.2-jdk-7-onbuild
MAINTAINER "RAJ KUMAR DUBEY" (rajkumar.dubey@heavywater.solutions)
RUN ls /usr/local/
RUN ls /usr/local/tomcat/
CMD ["catlina.sh", "run"]
