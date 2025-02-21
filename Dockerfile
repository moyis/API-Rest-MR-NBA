FROM gradle:jdk17

RUN mkdir /project

COPY ./ /project

WORKDIR /project

RUN gradle build -x test

## Correr el jar
CMD ["java", "-jar", "build/libs/restapi-0.0.1-SNAPSHOT.jar"]