FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar
ENV DB_URL=jdbc:postgresql://java_db:5432/MEA?createDatabaseIfNotExist=true&serverTimezone=UTC
ENV DB_USERNAME=postgres
ENV DB_PASSWORD=admin2024
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]