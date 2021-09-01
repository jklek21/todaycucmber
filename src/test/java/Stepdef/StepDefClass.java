package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefClass extends Baseclass
{
	

	@Given("user is on the Adactin page")
	public void a ()
	{
		
		
		
	}


	@When("user should enter {string} {string} and click the login button")
	public void user_should_enter_and_click_the_login_button(String string, String string2) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(string);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(string2);
		WebElement btLogin = driver.findElement(By.id("login"));
		btLogin.click();
	}
	@When("user should search hotel with {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_search_hotel_with(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement loc = driver.findElement(By.id("location"));
		Select a = new Select (loc);
		a.selectByVisibleText(string);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select b = new Select(hotel);
		b.selectByVisibleText(string2);
		WebElement txtroom = driver.findElement(By.id("room_type"));
		Select c = new Select(txtroom);
		c.selectByVisibleText(string3);
		WebElement room_no = driver.findElement(By.id("room_nos"));
		Select d = new Select(room_no);
		d.selectByVisibleText(string4);
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select e = new Select(adult);
		e.selectByVisibleText(string5);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select f = new Select(childRoom);
		f.selectByVisibleText(string8);
		WebElement datein = driver.findElement(By.id("datepick_in"));
	    datein.clear();
	    datein.sendKeys(string6);
	    WebElement dateout = driver.findElement(By.id("datepick_out"));
	    dateout.clear();
	    dateout.sendKeys(string7);
		WebElement btn = driver.findElement(By.id("Submit"));
		btn.click();
	}
	@When("user should select the hotel")
	public void user_should_select_the_hotel() {
		WebElement btn = driver.findElement(By.id("radiobutton_0"));
		btn.click();
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
	    
	}
	@When("user should select the hotel with {string}{string}{string}{string}{string}{string}{string}{string}")
	public void user_should_select_the_hotel_with(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	    WebElement fn = driver.findElement(By.id("first_name"));
	    fn.sendKeys(string);
	    WebElement ln = driver.findElement(By.id("last_name"));
	    ln.sendKeys(string2);
	    WebElement ad = driver.findElement(By.id("address"));
	    ad.sendKeys(string3);
	    WebElement cc = driver.findElement(By.id("cc_num"));
	    cc.sendKeys(string4);
	    WebElement cty = driver.findElement(By.id("cc_type"));
	    Select g = new Select(cty);
	    g.selectByVisibleText(string5);
	    WebElement exp = driver.findElement(By.id("cc_exp_month"));
	    Select h = new Select(exp);
	    h.selectByVisibleText(string6);
	    WebElement exm = driver.findElement(By.id("cc_exp_year"));
	    Select k = new Select(exm);
	    k.selectByVisibleText(string7);
	    WebElement ccv = driver.findElement(By.id("cc_cvv"));
	    ccv.sendKeys(string8);
	    WebElement btnclick = driver.findElement(By.id("book_now"));
	    btnclick.click();
	    Thread.sleep(3000);
	    WebElement order = driver.findElement(By.id("order_no"));
	    String s = order.getAttribute("value");
	    System.out.println(s);
	    
	}
	



}
