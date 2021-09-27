package net.tryCloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"json:target/cucumber.json",
           "html:target/default_html_report"},
        features = "src/test/resources/features",
        glue = "net/tryCloud/stepDefs",
        dryRun = false,
        tags = "@wips"

)
public class CukesRunner {
}
