Feature: Just a test with java and Cucumber
@Test
Scenario: Practice Form invalid data
    Given I open automation practice form
    And I insert "Fulanito" on field "First Name"
    And I insert "fulano" on field "Last Name"
    And I insert "test@mail.com" on field "name@example.com"
    And I click on "Other" radio button
    And I insert "111222333444" on field "Mobile Number"
    And I click on "Music" checkbox
    And I select "Select State" from dropDown menu
    When I click on "Submit" button
    Then I verify "Thanks for submitting the form"
    And I click on "Close" button
    

