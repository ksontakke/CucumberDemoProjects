package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/DataTable.feature",glue= {"testDefinition"})		//glue=("package name")

public class DataTableRunner 
{

}
