#MAINTAINER Sudharshan R

# For Java 8, try this
FROM openjdk:8-jdk-alpine
# For Java 11, try this
#FROM adoptopenjdk/openjdk11:alpine-jre

# For Java 17, try this -- creates lightweight image
#FROM openjdk:17-jdk-alpine3.14

ENV TZ="Asia/Dubai"
EXPOSE 8081
#EXPOSE 9502
#WORKDIR /deployScreen

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
#COPY /deployScreen/*.xml /deployScreen/

ENTRYPOINT ["java", "-jar", "/demo.jar"]