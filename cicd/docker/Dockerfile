#FROM openjdk:8-jdk-alpine
FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/demo-api-1.0.0.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java", "-Xms512M", "-Xmx768M", "-jar", "app.jar"]