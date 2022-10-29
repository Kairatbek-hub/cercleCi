FROM openjdk:17 AS build

WORKDIR /test/build

COPY . /test/build

RUN mvn clean install -DskipTests=true

FROM openjdk:17.0.2-jdk-slim
WORKDIR /test/app

COPY --from=build /test/build/target/demo-0.0.1-SNAPSHOT.jar /test/app/

EXPOSE 9090

ENTRYPOINT ["java","-jar","/test/app/demo-0.0.1-SNAPSHOT.jar"]
