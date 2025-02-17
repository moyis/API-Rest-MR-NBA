FROM gradle:jdk17-alpine AS build
RUN mkdir /project
COPY src /project
WORKDIR /project
RUN gradle clean build -x test

FROM eclipse-temurin:17-jre-alpine
RUN mkdir /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
COPY --from=build /project/build/libs/restapi-0.0.1-SNAPSHOT.jar /app/java-application.jar
WORKDIR /app
RUN chown -R javauser:javauser /app
USER javauser
CMD "java" "-jar" "java-application.jar"