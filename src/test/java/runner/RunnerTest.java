package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(      tags = "@smoke",
                                    features = "src/test/java/features",
		                            glue = {"base", "stepdef"},
		                            monochrome = true,
		                            dryRun = false,
		                            plugin = {"pretty", "html:target/report.html", "json:target/report_json.json"})
public class RunnerTest {
	
	

}