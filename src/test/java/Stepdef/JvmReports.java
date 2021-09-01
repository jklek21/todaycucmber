package Stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {

	public static void jvmReport(String jsonfile) 
	{
    
		File file = new File("C:\\Users\\91908\\eclipse-workspace\\cucumber\\src\\test\\resources\\report");
     
   net.masterthought.cucumber.Configuration configuration = new net.masterthought.cucumber.Configuration(file, "adcatin hotel automation");
   configuration.addClassifications("os", "windows 10");
   configuration.addClassifications("browser", "chrome");
   configuration.addClassifications("version", "92");
   configuration.addClassifications("sprint", "37");
   
   
   List<String> jsonfiles = new ArrayList<String>();
   jsonfiles.add(jsonfile);
   
   ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
   builder.generateReports();
     
	
	
	
	}
	
	
}

