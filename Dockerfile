FROM maven:3-openjdk-18 AS BUILD
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:18-slim
COPY --from=BUILD /tmp/target/*.jar /catalog.jar
EXPOSE 8080
CMD java -jar /catalog.jar
