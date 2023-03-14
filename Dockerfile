FROM ubuntu
WORKDIR /
COPY ./target/Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar
RUN apt update
RUN apt install -y openjdk-11-jdk
CMD ["java","-jar","Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]