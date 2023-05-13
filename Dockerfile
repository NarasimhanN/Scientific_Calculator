FROM ubuntu
WORKDIR /

# Update package repositories
RUN apt update

# Install JDK 11
RUN apt install -y openjdk-11-jdk

# Set JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64

# Set PATH environment variable to include Java
ENV PATH $PATH:$JAVA_HOME/bin
COPY ./target/Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java","-jar","Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
