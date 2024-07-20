package com.mhv.tpstest;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
public class TpsTestHook {

    @Before
    public void before(final Scenario scenario) {
        System.out.println(scenario.getSourceTagNames());
    }

    @Given("^load csv data for \"([^\"]*)\"$")
    public void loadCsvData(final String dateFolderName) {
        System.out.println("Inside load csv data step - Loading data to tables from input folder : [ " + dateFolderName + " ] --------------------------");
    }

    @Given("^run batch for \"([^\"]*)\"$")
    public void runBatch(final String dateFolderName) {
        System.out.println("Inside batch run step - Running batch for date : [ " + dateFolderName + " ] --------------------------");
    }

    @Given("^hit api \"([^\"]*)\"$")
    public void hitApi(final String dateFolderName) {
        System.out.println("Inside hit api step - Hitting API from input folder : [ " + dateFolderName + " ] --------------------------");
    }

    @Given("^verify db \"([^\"]*)\"$")
    public void verifyDb(final String dateFolderName) {
        System.out.println("Inside verify db step - Verifying db data from input files in folder : [ " + dateFolderName + " ] --------------------------");
    }
}