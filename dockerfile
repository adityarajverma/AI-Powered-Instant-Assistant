# Use Ubuntu as base image
FROM ubuntu:22.04

# Update package list and install OpenJDK 21
RUN apt update && apt install -y openjdk-21-jdk

# Verify installation
RUN java -version

# Set JAVA_HOME (optional but recommended)
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
ENV PATH="$JAVA_HOME/bin:$PATH"

#Set Working Directory
WORKDIR /app

#Copy Jar
COPY target/*.jar app.jar

#Expose Port
EXPOSE 8080

#Run Jar
ENTRYPOINT ["java", "-jar", "app.jar"]