package org.testrun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenReport {
	
	
	public static void report(String jsonFiles) {
		
		File file= new File("C:\\Users\\AravinD\\eclipse-workspace\\CucumberBase"
				+ "\\src\\test\\resources\\cucumber");
		
		Configuration config = new Configuration(file, "fb login");
		
		config.addClassifications("os", "Windows");
		config.addClassifications("version", "100");
		config.addClassifications("browser", "chrome");
		List<String> li = new ArrayList<String>();
		li.add(jsonFiles);
		
		ReportBuilder r = new ReportBuilder(li, config);
		
		r.generateReports();
		
	}

}
