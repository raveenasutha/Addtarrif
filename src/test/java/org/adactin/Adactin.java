package org.adactin;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Adactin {
	static WebDriver driver;
	@Given("^User launch the browser$")
	public void user_launch_the_browser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Xpath\\driv\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Given");
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("(//a[text()='Add Customer']) [1]")).click();
		driver.findElement(By.xpath("//label[text()='Done']")).click(); 
	}

	@When("^User click add customer$")
	public void user_click_add_customer() {
		driver.findElement(By.id("fname")).sendKeys("raveena");
		driver.findElement(By.id("lname")).sendKeys("suthagar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("raveena@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("78965956304");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@When("^User click add customer and enter valid details\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_click_add_customer_and_enter_valid_details(String s1, String s2, String s3, String s4, String s5) throws Exception {
		driver.findElement(By.id("fname")).sendKeys(s1);
		driver.findElement(By.id("lname")).sendKeys(s2);
		driver.findElement(By.id("email")).sendKeys(s3);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(s4);
		driver.findElement(By.id("telephoneno")).sendKeys(s5);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	
	@When("^User click add customer list$")
	public void user_click_add_customer_list(DataTable s12) {
		List<String> onedlist = s12.asList(String.class);
		driver.findElement(By.id("fname")).sendKeys(onedlist.get(0));
		driver.findElement(By.id("lname")).sendKeys(onedlist.get(1));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(onedlist.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(onedlist.get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(onedlist.get(4));
		driver.findElement(By.xpath("//input[@type='submit']")).click();  
	}

	@When("^User click add customer two-dim-list$")
	public void user_click_add_customer_two_dim_list(DataTable s5)  {
		List<List<String>> twodlist = s5.asLists(String.class);
		driver.findElement(By.id("fname")).sendKeys(twodlist.get(1).get(0));
		driver.findElement(By.id("lname")).sendKeys(twodlist.get(1).get(1));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(twodlist.get(1).get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twodlist.get(1).get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twodlist.get(1).get(4));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
	}

	@When("^User click add customer map$")
	public void user_click_add_customer_map(DataTable s5)  {
		Map<String, String> custData = s5.asMap(String.class, String.class);
		driver.findElement(By.id("fname")).sendKeys(custData.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(custData.get("lname"));
		driver.findElement(By.id("email")).sendKeys(custData.get("email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(custData.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(custData.get("phno"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
  
	}

	@When("^User click add customer two-dim-map$")
	public void user_click_add_customer_two_dim_map(DataTable arg1) {
		List<Map<String, String>> twodmap = arg1.asMaps(String.class, String.class);
		driver.findElement(By.id("fname")).sendKeys(twodmap.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(twodmap.get(1).get("lname"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(twodmap.get(2).get("email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twodmap.get(2).get("address"));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twodmap.get(1).get("phno"));
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	}

	@Then("^User validate the custID$")
	public void user_validate_the_custID()  {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());	
	    
	}

}