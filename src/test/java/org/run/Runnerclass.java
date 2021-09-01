package org.run; 

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Stepdef.JvmReports;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91908\\eclipse-workspace\\cucumber\\src\\test\\resources\\feature\\login.feature", 
glue="Stepdef",
monochrome=true,
plugin = {"pretty",
		"html:C:\\Users\\91908\\eclipse-workspace\\cucumber\\src\\test\\resources\\report\\cucumber.html",
		"json:C:\\Users\\91908\\eclipse-workspace\\cucumber\\src\\test\\resources\\report\\cucumber.json",
		"junit:C:\\Users\\91908\\eclipse-workspace\\cucumber\\src\\test\\resources\\report\\cucumber.xml"
		},
dryRun = false)


public class Runnerclass {
	
		@AfterClass
		public static void afterclass() {

			JvmReports.jvmReport("C:\\\\Users\\\\91908\\\\eclipse-workspace\\\\cucumber\\\\src\\\\test\\\\resources\\\\report\\\\cucumber.json");
		}
	
	
	

}
