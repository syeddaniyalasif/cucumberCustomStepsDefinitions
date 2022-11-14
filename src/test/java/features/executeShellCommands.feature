#Author: daniyal.asif@gmv.com

Feature: CustomSteps

  Scenario: Test Custom Steps
    Then the directory "C://temp" should contain 10 files
    And each file should be no larger than 200mb
    Then execute shell command "rm -rf /dcfdp_workarea/*"
