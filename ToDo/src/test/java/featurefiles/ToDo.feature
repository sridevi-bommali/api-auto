Feature: ToDo Web Services
  In order to ToDo items
  As a web service consumer
  I would like to create, edit, view and delete ToDo records (items)

  @get @positive
  Scenario: I'd like to retrieve all available ToDo items
    Given I use the GET endpoint "/todos"
    Then I should be able to view all available ToDo items

  @get @positive
  Scenario: I'd like to retrieve ToDo details of a specific item
    Given I use the GET endpoint "/todos/25"
    Then I should be able to view ToDo details of the specific item

  @post @positive
  Scenario: I'd like to create a new ToDo item with valid data
    Given I use the POST endpoint /todos with a request body
    Then I should be able to create a new ToDo item

   @put @positive
   Scenario: I'd like to update a ToDo item with new data
     Given I use the PUT endpoint "/todos/25"
     Then I should be able to update a Todo item

   @delete @positive
  Scenario: I'd like to delete a specific ToDo item
     Given I use the DELETE endpoint "/todos/25"
     Then I should be able to delete a specific Todo item
