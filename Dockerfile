FROM openjdk:18
ADD target/springboot-mongodb-docker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]