package org.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\AravinD\\eclipse-workspace\\CucumberBase\\"
		+ "src\\test\\resources\\FeaturesFile\\cucu.feature",glue= "org.stepdefin", monochrome= true, tags="@smoke")
public class Testrun {

}
