FROM openjdk:8-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring

COPY run.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

USER spring:spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /app.jar

CMD ["/entrypoint.sh"]