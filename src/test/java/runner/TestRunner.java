package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"stepDefinition", "TestComponents"},
        plugin = {
                "pretty", // Console output
                "html:target/cucumber-reports/cucumber-reports.html", // HTML report
                "json:target/cucumber-reports/Cucumber.json", // JSON report
                "junit:target/cucumber-reports/Cucumber.xml", // JUnit report
                "rerun:target/rerun.txt" // Rerun report
        },
        publish = true // Publish report to Cucumber Reports service
)
public class TestRunner {

}
