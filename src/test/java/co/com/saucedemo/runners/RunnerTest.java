package co.com.saucedemo;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "co.com.saucedemo.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class RunnerTest {
}
