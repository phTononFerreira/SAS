FROM openjdk:18-jdk-slim

WORKDIR /app

COPY SAS/targetProjetoOI-1.0-SNAPSHOT.jar /app/ProjetoOI-1.0-SNAPSHOT.jar


CMD ["java", "-jar", "ProjetoOI-1.0-SNAPSHOT.jar"]
