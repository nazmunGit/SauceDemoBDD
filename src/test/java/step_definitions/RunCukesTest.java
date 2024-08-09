package step_definitions;


import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@Cart",
        features = {"classpath:features"},
        glue = { "classpath:step_definitions"},
        //plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
        plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"}
)

public class RunCukesTest extends AbstractTestNGCucumberTests {

}
