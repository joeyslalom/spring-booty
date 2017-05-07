# Dockerfile to use with Spring Batch and Google Cloud Engine
# The VOLUME line and the RUN touch line are from: https://spring.io/guides/gs/spring-boot-docker/

# This docker image can be built in different ways:

# 1. Locally: $ ./gradlew build && docker build .
# 2. Google Cloud Container builder: $ ./gradlew clean && gcloud container builds submit --config=java.yaml .
# 3. Google App Engine: $ gcloud app deploy app.yaml


# FROM openjdk:8-jre-alpine
FROM gcr.io/google_appengine/openjdk
VOLUME /tmp
COPY build/libs/*jar /app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
EXPOSE 8080