FROM openjdk:18-jdk-slim

WORKDIR /app

COPY SAS/target/ProjetoOI-1.0-SNAPSHOT.jar /app/ProjetoOI-1.0-SNAPSHOT.jar

RUN apt-get update && apt-get install -y x11-apps

CMD ["java", "-Djava.awt.headless=true", "-jar", "ProjetoOI-1.0-SNAPSHOT.jar"]
