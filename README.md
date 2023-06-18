# Vuong Phan

Hybrid Test Automation Framework
- Maven
- Page Object Model
- TestNG

## Description
- The scenarios are in .feature files of resources package
- The steps of scenario is defined in stepsDefinitions package
- The located elements is saved to separate file in pageObjects package
- The TestRunner files to run Junit test with configured 

## How to run
1. Run manually in IntelliJ tool
- Run the textng.xml file in recources/test_suites

2. Run by commandline 
```batch
mvn clean install test -DsuiteXmlFile=./src/test/resources/test_suites/testngSuite.xml
```
