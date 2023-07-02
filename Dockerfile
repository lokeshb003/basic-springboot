FROM ubuntu:latest
WORKDIR .
RUN apt update && apt install openjdk-17-jdk -y
COPY ./target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 80
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]