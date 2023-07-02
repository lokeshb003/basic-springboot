FROM ubuntu:latest
WORKDIR .
RUN apt update && apt install openjdk-17-jdk -y
COPY ./target/demo-*.jar .
EXPOSE 80
CMD ["java","-jar","demo-*.jar]