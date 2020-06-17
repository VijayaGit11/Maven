package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "C:/Users/HP/Documents/Framework/MavenDemo/src/test/java/Features/BigBasketLogin.feature",
		 glue = {"StefDefinition"},
		 dryRun =  false,	
//		 tags = {""},
		 monochrome = true,
		 strict = true
//		 format = {"pretty","html:test-autput", "json:json-autput/cucumber.json", "junit:junit_xml/cucumber.xml"},
		)
public class TestRunner {

}
