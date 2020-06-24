# ClearPointAssignment

Practical test (API)

I have created a Test Suite that tests all the below API’s using BDD(Cucumber/Gherkin) in Java.

Tools & Technologies:

1.Rest Assured 
2.Cucumber
3.IntelliJ
4.Java
5.postman 

Step 1:


Create New Project in IntelliJ and convert it into Maven Project

Step 2: 

Add required dependency in pom.xml file

Step3:

Under Test - Java

Create Feature package under which Feature files are created 
Create Step Definition package under which Java Class files are created

Step 5:

Under Main – Java

Create a helper package under which “ToDoHelper” java class file is created functions of Get, Put, Post and delete are written.

These functions are called in step definition file.

Step 6:

Write Scenarios in Feature file and Step definitions for each scenario get created automatically 

We can copy the step definition skeleton created by feature file and use it in step definition file and customize our code to execute the Get operation.

When we execute it will return result as 5 scenarios passed

 
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


