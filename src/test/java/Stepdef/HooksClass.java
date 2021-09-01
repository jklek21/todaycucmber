package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends Baseclass {


	
	@Before
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      System.out.println("Before hooks");
      System.err.println("mythulya");

      System.out.println("lekshitha");
   
	}
	
	@After
	public void after(Scenario sc) {
		
		if (sc.isFailed()) {
			TakesScreenshot ts =(TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, sc.getName()+".png");
			
			
		}
    
	}
} 



