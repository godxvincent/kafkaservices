FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} producerkafkarest-1.jar
ENTRYPOINT ["java","-jar","/producerkafkarest-1.jar"]