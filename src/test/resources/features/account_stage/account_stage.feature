Feature: Test account stage process
  Background: Load stage table with sample data, run batch and test data load

    @feature.account_stage.scenario01
    Scenario: 1. Test with correct data and verify data load through fetch api call

      Given load csv data for "2023-01-01"
      And run batch for "2023-01-01"
      And hit api "2023-01-01"


    @feature.account_stage.scenario02
    Scenario: 2. Test with correct data and verify data in table

      Given load csv data for "2023-01-01"
      And run batch for "2023-01-01"
      And verify db "2023-01-01"