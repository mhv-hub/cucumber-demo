package com.mhv.tpstest.account_stage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
    features = "src/test/resources/features/account_stage/account_stage.feature",
    glue = "com.mhv.tpstest")
public class AccountStageTest {
}
