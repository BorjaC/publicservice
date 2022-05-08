FROM fabric8/java-alpine-openjdk11-jre
VOLUME /tmp
COPY target/public-0.0.1-SNAPSHOT.jar app.jar
COPY . /tmp/
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar", "--spring.config.location=/tmp/src/resources/application.yml"]