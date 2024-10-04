# My Cucumber Project

This project demonstrates how to set up and run Cucumber tests with Selenium in a Dockerized environment. It also includes instructions for running the tests locally using Maven.

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- Docker and Docker Compose

## Project Structure
my-cucumber-project/ ├── .github/ │ └── workflows/ │ └── ci-cd.yml ├── src/ │ ├── main/ │ │ └── java/ │ │ └── your/package/ │ │ └── MainApplication.java │ ├── test/ │ │ ├── java/ │ │ │ ├── runner/ │ │ │ │ ├── TestRunner1.java │ │ │ │ ├── TestRunner2.java │ │ │ │ └── TestRunner3.java │ │ │ ├── stepDefinitions/ │ │ │ │ └── StepDefinitions.java │ │ │ ├── TestComponents/ │ │ │ │ ├── Hooks.java │ │ │ │ ├── TestContext.java │ │ │ │ └── PageObjectManager.java │ │ │ └── pageObjects/ │ │ │ ├── HomePage.java │ │ │ └── LoginPage.java │ │ └── resources/ │ │ ├── features/ │ │ │ ├── feature1.feature │ │ │ ├── feature2.feature │ │ │ └── feature3.feature │ │ ├── testData/ │ │ │ ├── GlobalData.properties │ │ │ └── TestData.xlsx │ │ └── log4j2.xml ├── Dockerfile ├── docker-compose.yml ├── run_tests.sh ├── pom.xml └── README.md


## Running Tests Locally

### Using Maven

#Clean and Install Dependencies**:
   mvn clean install

#Run Tests
mvn test

#Run a Specific Test Runner:
mvn -Dtest=TestRunner1 test 

#Running Tests in Docker
#Build and Run Docker Containers

#Build Docker Image
docker build -t my-app .

#Run Docker Compose:
docker-compose up --build --abort-on-container-exit

#Stop and Remove Containers:
docker-compose down

