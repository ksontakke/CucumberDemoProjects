package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/backgrounddemo.feature",glue= {"testDefinition"},plugin= {"pretty","junit: target/junit-report/cucumberlogin.xml"})

public class backgroundRunner 
{

}
