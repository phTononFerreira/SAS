FROM openjdk:18-jdk-slim

WORKDIR /app

# Instalação do Xvfb
RUN apt-get update && apt-get install -y xvfb

# Copia o arquivo JAR para o diretório de trabalho
COPY SAS/target/ProjetoOI-1.0-SNAPSHOT.jar /app/ProjetoOI-1.0-SNAPSHOT.jar

# Configuração do Xvfb e execução do aplicativo
CMD ["bash", "-c", "Xvfb :0 -ac +extension RANDR && java -jar -Djava.awt.headless=false ProjetoOI-1.0-SNAPSHOT.jar"]
