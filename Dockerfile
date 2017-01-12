FROM tomcat:8.0
FROM java:openjdk-7-jdk
FROM maven:3.2-jdk-7-onbuild
MAINTAINER "RAJ KUMAR DUBEY" (rajkumar.dubey@heavywater.solutions)
RUN echo $TOMCAT_VERSION
RUN echo $PATH
RUN echo $CATALINA_HOME
RUN which apache-tomcat-$TOMCAT_VERSION
RUN whereis apache-tomcat-$TOMCAT_VERSION
RUN which tomcat
RUN whereis tomcat
CMD ["catlina.sh", "run"]
