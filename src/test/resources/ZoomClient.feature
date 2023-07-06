Feature: Zoom Client support low bandwidth
  As A soemthing 
  I want Something 
  So that Something
  @UnitTest
  Scenario: Addition
    Given User enter "2,3,+"
    Then Result should be 5
	@RegressionTest
  Scenario Outline: test mltiple scenarios
    Given I have <input>
    Then I get  <output>

    Examples: 
      | input   | output |
      | "2,2,+" |      4 |
      | "2,3,+" |      7 |
      | "2,4,+" |      7 |
