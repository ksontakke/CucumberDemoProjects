package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/ScenarioOutline.feature",glue= {"testDefinition"})

public class ScenarioOutlineRunner 
{

}
