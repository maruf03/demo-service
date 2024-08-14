FROM openjdk:17
ADD target/demo-service-0.0.1-SNAPSHOT.jar demo-service.jar
EXPOSE 9007
ENTRYPOINT [ "java", "-jar", "demo-service.jar" ]