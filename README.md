# Spring Boot application with AWS Rekognition SDK

## Run

`mvn spring-boot:run`

## Build

`mvn clean package`

`docker build -t rekognition .`

`docker run -p 8080:8080 -t rekognition:latest`

## Endpoint

http://localhost:8080/api/images/labels