package com.zerobank.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/feature/",
        glue = "com/zerobank/step_definition",
        dryRun = false,
        tags = "@AS"





)

public class cukesRunner {
}

