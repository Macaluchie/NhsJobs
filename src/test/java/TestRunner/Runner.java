package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources",
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/NhsJobs.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)


public class Runner extends AbstractTestNGCucumberTests {


}
