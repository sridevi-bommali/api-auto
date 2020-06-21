# ClearPointAssignment

Practical test (API)

I have created a Test Suite that tests all the below API’s using BDD(Cucumber/Gherkin) in Java.

Tools & Technologies:

Eclipse
Maven
Rest Assured dependencies
Cucumber
Selenium

Step 1:

In order to create Maven Project File -> New -> other -> Maven Project and choose defaults and give name for our project “ClearPoint_RestAssured_BDD”

Step 2:

Add all the required dependency
 
•	Rest Assured
•	Json-schema-validator
•	Json-path
•	Xml-path
•	Testng
•	Java-hamcrest
•	Hamcrest-library
•	Cucumber-java
•	Cucumber-junit

Step 3:

Add all the dependency in pom.xml from Maven Repository. You can find pom.xml file if we expand our project

Step 4:

Create a Feature file with .feature extension under Resources, features

Inside the feature file write scenarios for each API and save the file

Step 5:

Create a new package where you will have step definition files 

Create Step Definition for each API with .java extension under created package

Step definitions should be created in accordance with feature file

Step 6:

Then create a runner file where our scenarios are executed so that they call the step definition and execute our test

We can run smoke test , regression test , different tests here. We can choose which scenario to be executed for which test using Tags

We can create more scenarios based on understanding of underlying error messages of the API like 500,404 etc.

We can also 













Task: 

1.	Write a test scenario or several scenarios using BDD (Cucumber/Gherkin) and implementation on any language you like to test an API.
2.	Scenario can for example  check “a list of all to-dos is returned successfully and contains 200 todos” functionality, but feel free to be creative. 

What are we also looking for:
•	a clear explanation of the steps to produce the tests
•	and explanation of all the underlying technologies and frameworks, what they do and how they work.
•	what you learnt and challenges you faced

Todos REST API  with a list of 200 to-dos
API definition:

Endpoint: https://jsonplaceholder.typicode.com/todos

GET
get the list of all todos
https://jsonplaceholder.typicode.com/todos

GET a to-do
https://jsonplaceholder.typicode.com/todos/25

POST a todo
https://jsonplaceholder.typicode.com/todos
Body:
{
"title": "foo",
"body": "bar",
"id": 203
}

PUT - update a todo
https://jsonplaceholder.typicode.com/todos/25
Body:
{
"title": "foo",
"body": "bar",
"id": 25
}

DELETE a todo
https://jsonplaceholder.typicode.com/todos/25

Note: this is a fake API designed for testing purposes, for example if you add a new todo - it will not be really created on the server but the response will be faked as if. See more for details here:  https://jsonplaceholder.typicode.com/  


