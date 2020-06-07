package com.zerobank.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/feature/",
        glue = "src/test/java/com/zerobank/step_definitions/",
        dryRun = true,
        tags = "@first"


)

public class cukesRunner {
}

