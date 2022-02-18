package cydeo.com.bookit.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"json:target/cucumber.json",
                    "html:target/default-html-reports"},
            features = "src/test/resources/features",
            glue = "cydeo/com/bookit/step_definitions",
            dryRun = true,
            tags = ""
    )
    public class CukesRunner {
    }


