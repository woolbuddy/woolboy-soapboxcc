# Woolboy Soapbox Framework
Woolboy Soapbox Framework is an automation framework designed to test the marketing website for Podium.
The design pattern used is Page Object Model in Selenium and the framework was built using Java in the Eclipse IDE as a Maven project.

## Features
### Automated UI Tests using Selenium
There are 5 fully automated tests included in this framework that I would consider smoke tests for the Podium marketing website.
### Automatic Retry on Failure
There is a retry analyzer built in to retry a failing test before moving on to the next test.
### Reporting and Screenshots
Upon completion of the test suite running, an HTML report will be generated and populated in the 'reports' folder. Any failing tests will generate a screenshot and populated in the 'screenshots' folder.

## Getting Started
### Dependencies
* Java
* Maven
### Installing & Running Tests
1. Clone this project locally
2. Navigate to project from your command line
3. Run `mvn clean`from your command line
4. Run `mvn test` from your command line

## Reading Test Results
### Command Line Test Results
![Alt text](https://i.ibb.co/zXNX2Wh/Automation-Report-html-woolboyframework.png?raw=true)

### Viewing the Report HTML
If you are using Eclipse, opening the file will automatically open the html in a browser locally. If you are not using Eclipse, use the following steps to view the report.
1. Navigate to the project from your command line
2. Run `open -a "Google Chrome" reports/AutomationReport.html`

### Viewing the Screenshots
You should be able to view the screenshot captured during a failed test by opening the .png file in the 'screenshots' folder.

## ToDo List
* Fix failing test (ContactBubbleTest.java)
* Find any common elements and events and implement code to allow them to be used across multiple tests.
* Create a Dockerfile
