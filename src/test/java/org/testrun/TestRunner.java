package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AravinD\\eclipse-workspace\\CucumberBase\\src\\test"
		+ "\\resources\\FeaturesFile\\fblogin.feature",glue="org.stepdef",plugin= {"pretty","json:C:\\Users\\AravinD\\eclipse-workspace\\CucumberBase\\src\\test\\resources\\report.json"}
		)

public class TestRunner {
	
	
	@AfterClass
	public static void r1() {
		
		GenReport.report("C:\\Users\\AravinD\\eclipse-workspace\\CucumberBase\\src\\test\\resources\\report.json");
		
	}

}
