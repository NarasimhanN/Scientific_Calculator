FROM ubuntu
WORKDIR /
RUN apt update
RUN apt install -y openjdk-11-jdk
COPY ./target/Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java","-jar","Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]