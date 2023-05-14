FROM ubuntu
WORKDIR /

# Update package repositories and install necessary packages
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    --fix-missing

# Set JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64

# Set PATH environment variable to include Java
ENV PATH $PATH:$JAVA_HOME/bin

# Copy the application JAR file
COPY ./target/Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar

# Set the entry point command to run the JAR file
CMD ["java", "-jar", "Calculator_MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
