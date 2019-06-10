package cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun/failscenario.txt",glue="cucu",
plugin={"html:C:\\Users\\training_c2a.05.01\\workspace\\cucu\\","rerun:rerun/failedscenario.txt"})



public class Runner {

}
