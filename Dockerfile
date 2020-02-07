FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./Ejemplo-Microservicio/target/*.jar
COPY ./Ejemplo-Microservicio/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
