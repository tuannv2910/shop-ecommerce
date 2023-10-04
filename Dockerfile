FROM maven:3.8.6-jdk-11 as builder

RUN mvn install

FROM openjdk:11.0.10-jdk-slim

VOLUME /tmp

COPY target/*.jar shop-ecommerce.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","/shop-ecommerce.jar"]