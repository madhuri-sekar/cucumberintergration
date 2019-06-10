package cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun/failscenario.txt",glue="cucu",
plugin={"json:target/cucumber.json"})



public class Runner {

}
