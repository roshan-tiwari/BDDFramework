package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dataProvider.DataProvider;
 
@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/java/featuresfile",
				 glue= {"stepDef"},
				 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
				 monochrome = true
 )


public class Runner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/extentreporting/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
	}
}
