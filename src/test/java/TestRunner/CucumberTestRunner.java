package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/Features"}, glue = {"StepDef"},
plugin = {"pretty","html:target/Reports/htmlReports.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests  {

}
