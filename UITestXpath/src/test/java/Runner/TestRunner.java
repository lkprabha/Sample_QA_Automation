package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"},
        glue = {"src/test/java/steps/MyLogin"}
)

public class TestRunner {

}

