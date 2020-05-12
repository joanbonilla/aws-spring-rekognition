
# Spring Boot application with AWS Rekognition SDK  
  
## Requirements  

 - Java 8   
 - Maven 3   
 - Docker (optional) 19
  
## Build  
  
`mvn clean package`  
  
`docker build -t rekognition .`  
  
or  
  
`docker build -t <awsaccountid>.dkr.ecr.<region>.amazonaws.com/rekognition .`  
  
`docker push <awsaccountid>.dkr.ecr.<region>.amazonaws.com/rekognition`  
  
## Run  
  
`mvn spring-boot:run`  
  
or  
  
`docker run -p 8080:8080 -t rekognition:latest`  
  
## Endpoints
  
Test rekognition: http://localhost:8080/api/images/labels  
Health check: http://localhost:8080/actuator/health
