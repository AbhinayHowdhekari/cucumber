package runnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "D:\\JavaProject\\urBuddi\\Cucumber\\src\\test\\resources\\CucumberFeatureFile\\",
    glue= "test",
    tags = "@addemployeewithDatatable",
    monochrome = true
)
public class Runnerclass extends AbstractTestNGCucumberTests {
	
}
