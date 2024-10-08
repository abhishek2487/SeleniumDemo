**Selenium Demo Framework**

**Overview**

Selenium Demo is a project designed to automate various features of the New York Times website using Selenium and Cucumber. The goal is to ensure the website’s quality and functionality through automated testing.

This framework utilizes Selenium WebDriver for browser automation and Cucumber for managing and executing test cases. The project is organized to support a thorough testing strategy, with well-defined directories for source code, reports, and test outputs. Maven is used for dependency management, simplifying the process of managing and updating project libraries. The framework is capable of cross-browser testing and data-driven testing, and it generates detailed reports for each test run. Configuration files like pom.xml and cucumber.xml facilitate seamless setup and execution of tests.

**Technologies Used**

•	Framework Type: Data Driven Framework

•	Design Pattern: Page Object Model with Factory Design Pattern, External Object Repository, and Inbuilt Custom Annotations

•	Selenium WebDriver: For browser automation

•	Cucumber: For Behaviour Driven development (BDD) and organizing test cases

•	Maven: For dependency management, project lifecycle, and build automation

•	Java: Primary programming language

•	HTML, CSS, JavaScript, XML: For web interactions

**Project Structure**

.idea: IntelliJ IDEA configuration files.

src: Source code for all the test scripts, this package consists of below given structure.

src/main/java: Consists of all the packages for Page Objects and Page Object Managers

src/test/java: Test Runners, Step Definition Files, Test Component Package consisting Hooks and TestContext file and utilities package for Excel utility

src/test/resources: Features folder containing the feature file, Test Data folder containing Global Config files and test data excel

.gitignore: Git ignore file.

pom.xml: Maven project file for managing dependencies.

target/cucumber-reports: Directory containing report files.

Docker file: All the instructions regarding the parent image, how the files should be copied, Build commands etc are provided.

Docker compose file: All the information regarding services, port mapping, network etc are provided

Run_tests.sh – It is being used in docker compose file to run the command - mvn test

**Getting Started**
**Prerequisites**
 - Java Development Kit (JDK)
 - Maven
 - IntelliJ IDEA or any other IDE

**Installation**

**Clone the repository:**

git clone abhishek2487/SeleniumDemo (github.com)

**Navigate to the project directory:**

cd SeleniumDemo

**Install dependencies:**

mvn clean install

###**Running Tests**


**Run the Tests manually using IDE**

- Open the project in IntelliJ IDEA.
- Execute the cucumber tests using Junit.
  - Right-click on TestRunner.java under runner package
  - Select "Run ‘TestRunner’".

**Running Tests using CLI**

Navigate to the project directory and execute the below command

•	mvn test

Note: Above command will run the test on default browser chrome
Below are the command for running the tests with different browsers using CLI

•	mvn test -Dbrowser=edge

•	mvn test -Dbrowser=firefox

•	mvn test -Dbrowser=chrome

**Running Tests on different browser**

src/test/resources/testData/GlobalData.properties

Change the browser name to below in the above mentioned config file for running on different browser and execute the steps mentioned in running the tests using IDE:

- Chrome(Currently set)
- Edge
- Firefox

**Run the tests using Docker compose file**

Execute the following command to start the services and run the tests

docker-compose up --abort-on-container-exit --exit-code-from tests

Note : Above command will start all the services defined in your docker-compose.yml file, run the tests, and then stop all the services once the tests are complete.

**Test Scenarios Overview**

Below mentioned are 4 tests distributed in two feature files namely:

  •	Login.feature – Having 3 scenarios around Login

  •	Search.feature – Having scenario around search

**Scenario 1: Scenario: Validate error message should be displayed when incorrect email is entered.**

This will validate the error message will be displayed during login when user enter the email id which is not in the correct format.

**Scenario 2: Validate user should be taken to create your account page when no previous account exists for entered email id**

This scenario validates the user should be taken to create account page when the fresh email id is entered during the login process.

**Scenario 3: Validate user should be able to edit the email id on Create Account Page**

This scenario validates a user should be able to edit the entered email id on create account page during the login process.

**Scenario 4: User should be able to search for the news**

This scenario validates if used is able to search the news with help of search functionality


