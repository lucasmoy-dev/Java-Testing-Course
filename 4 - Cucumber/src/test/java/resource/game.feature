Feature: Game Rock, Paper, or Scissors

  Scenario: The user wins when chooses Rock and computer chooses Scissors
    Given the user will choose "rock"
    And the computer will choose "scissors"
    When they play
    Then verify that the computer chose "scissors"
    And the user wins

  Scenario: The user wins when chooses Scissors and computer chooses Paper
    Given the user will choose "scissors"
    And the computer will choose "paper"
    When they play
    Then verify that the computer chose "paper"
    And the user wins

  Scenario: The user wins when chooses Paper and computer chooses Rock
    Given the user will choose "paper"
    And the computer will choose "rock"
    When they play
    Then verify that the computer chose "rock"
    And the user wins

  Scenario: The user lose when chooses Rock and computer chooses Paper
    Given the user will choose "rock"
    And the computer will choose "paper"
    When they play
    Then verify that the computer chose "paper"
    And the user lose

  Scenario: The user tie when chooses Rock and computer chooses Rock
    Given the user will choose "rock"
    And the computer will choose "rock"
    When they play
    Then verify that the computer chose "rock"
    And the user tie