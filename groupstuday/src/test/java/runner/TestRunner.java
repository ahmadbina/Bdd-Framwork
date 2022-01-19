package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utitlities.CucumberReportinConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".\\src\\test\\resouces\\features",
		glue = "stepDifinitions",
		tags="@smoke",
		dryRun= false,
		strict=true,
		monochrome= true,
		plugin={	"pretty",
				"html:target/site/cucumber.pretty",
				"json:target/cucumber.json"

},
		publish= true
		)

public class TestRunner {
	@AfterClass
	public static void generateReport() {
		CucumberReportinConfig.reportConfig();
	}


}
