package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features" ,glue ="MainScript",
monochrome = true ,dryRun = false ,tags = "@this" ,plugin= {"pretty","html:target/Cucu.html" ,"json:target/Cucu.json","junit:target/Cucu.xml"} )
public class TestRunner {
	
}
