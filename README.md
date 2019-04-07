## Spring Boot Example with Gradle
- [spring-boot-sample-web-ui](https://github.com/spring-projects/spring-boot/tree/v2.0.2.RELEASE/spring-boot-samples/spring-boot-sample-web-ui) 기반 웹어플리케이션
- Health check 추가
- gradle 

```bash
# build
$ ./gradlew bootJar
$ docker build -t wicksome/spring-boot-gradle-example .
$ docker run -p 8080:8080 wicksome/spring-boot-gradle-example 

# push
$ docker push wicksome/spring-boot-gradle-example:<tag>
```
