Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Simple Operation
    Given user enter <Input>
    And user decide to do something
    Then user should get <Output>

    Examples: 
      | Input       | Output |
      | "2,3,1,+,+" |      6 |
      | "2,3,4,+,+" |      9 |
      | "2,3,4,+,*" |     14 |
