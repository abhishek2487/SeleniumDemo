# Use an official Maven image to build the application
FROM maven:3.8.4-openjdk-11 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean install

# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the built application from the build stage
COPY --from=build /app/target/my-app.jar my-app.jar

# Copy the test resources
COPY src/test/resources /app/src/test/resources

# Run the application
ENTRYPOINT ["java", "-jar", "my-app.jar"]
