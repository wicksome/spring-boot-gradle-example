FROM openjdk:8
LABEL maintainer="Yeongjun Kim <opid911@gmail.com>"

VOLUME /tmp

ARG JAR_FILE=build/libs/spring-boot-gradle-example-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
