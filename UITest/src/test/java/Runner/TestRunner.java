package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
@CucumberOptions(features={"src/test/java/features"},
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"},
        glue = {"src/test/java/steps/MyLogin"}
)

public class TestRunner {


}

