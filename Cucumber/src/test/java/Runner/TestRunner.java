package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},
glue= {"Definition"},
dryRun = false,
plugin= {"html:testoutput/tapasya.html","json:testoutput/tapasya.json"}
)
public class TestRunner {

}
