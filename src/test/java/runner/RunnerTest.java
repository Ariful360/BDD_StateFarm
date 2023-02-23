package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(      tags = "@auto", 
                                    features = "src/test/java/features",
		                            glue =  "stepdef",
		                            monochrome = false,
		                            dryRun = false,
		                            plugin = {"pretty", "html:target/report.html", "json:target/report_json.json"})
public class RunnerTest {
	
	

}
