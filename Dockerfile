FROM java:openjdk-7-jdk
FROM tutum/tomcat:8.0
FROM maven:3.2-jdk-7-onbuild
MAINTAINER "RAJ KUMAR DUBEY (rajkumar.dubey@heavywater.solutions)
RUN echo $TOMCAT_VERSION
RUN echo $PATH
RUN echo $CATALINA_HOME
CMD ["catlina.sh", "run"]
