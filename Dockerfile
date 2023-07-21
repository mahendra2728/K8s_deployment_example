FROM openjdk:8
EXPOSE 8080
ADD target/quarkus-app/quarkus-run.jar quarkus-run.jar
ENTRYPOINT ["java","-jar","/quarkus-run.jar"]
