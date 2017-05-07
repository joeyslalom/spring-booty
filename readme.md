## What is this

* Java Web application: Spring Boot
  * https://projects.spring.io/spring-boot/
* OpenAPI (aka Swagger) integration via SpringFox
  * http://springfox.github.io/springfox/

## Run locally

Build: `./gradlew build`

Run: `./gradlew bootRun`

Swagger: `http://localhost:8080/swagger-ui.html`

## Docker

Build docker image: `docker build -t spring-booty:latest .`

Run docker image: `docker run -p 8080:8080 spring-booty:latest`

Remove stopped docker containers: `docker rm $(docker ps -a -q)`

Remove dangling images: `docker rmi $(docker images --filter "dangling=true" -q --no-trunc)`

## DIY

1. New project from spring initializer 
    * https://start.spring.io/
2. Make web project 
    * https://spring.io/guides/gs/rest-service/
3. Add swagger integration
    * http://heidloff.net/article/usage-of-swagger-2-0-in-spring-boot-applications-to-document-apis/
4. Add Dockerfile
5. Add Kotlin
6. Add Google Cloud
