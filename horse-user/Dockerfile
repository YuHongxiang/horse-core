FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /test/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]