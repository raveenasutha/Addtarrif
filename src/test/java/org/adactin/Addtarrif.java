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

public class Addtarrif {
	static WebDriver driver;
	
	@Given("^user should be telecom homepage and navigate to Addtariffplan page$")
	public void user_should_be_telecom_homepage_and_navigate_to_Addtariffplan_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Xpath\\\\driv\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();  
	}

	@When("^user should enter plan details and click submit$")
	public void user_should_enter_plan_details_and_click_submit()  {
		driver.findElement(By.id("rental1")).sendKeys("199");
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("432");
		driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys("546");
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("67");
		driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys("988");
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys("876");
		driver.findElement(By.xpath("//ul[@class='actions']/li/input")).click(); 
	
	}

	@Then("^user should be displayed with congratulation you add Tariffplan$")
	public void user_should_be_displayed_with_congratulation_you_add_Tariffplan()  {
		Assert.assertTrue(
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		

	}

	@When("^user should enter plan details in twodlist$")
	public void user_should_enter_plan_details_in_twodlist(DataTable arg1){
	    	
		try {
			List<List<String>> data = arg1.asLists(String.class);

			driver.findElement(By.id("rental1")).sendKeys(data.get(1).get(0));
			driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(data.get(3).get(1));
			driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(data.get(3).get(1));
			driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(data.get(3).get(2));
			driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(data.get(3).get(5));
			driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys(data.get(3).get(4));
			driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(data.get(3).get(6));
			driver.findElement(By.xpath("//ul[@class='actions']/li/input")).click();

		} catch (Exception e) {
		}}

	@Then("^user should be disply with congratulation you add Tariffplan$")
	public void user_should_be_disply_with_congratulation_you_add_Tariffplan()  {
		Assert.assertTrue(
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());  
	}

	@When("^user should enter plan details in twodmap$")
	public void user_should_enter_plan_details_in_twodmap(DataTable arg1)  {
		try {
			List<Map<String, String>> datas = arg1.asMaps(String.class, String.class);

			driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get("MR"));
			driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(datas.get(3).get("IM"));
			driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(datas.get(3).get("LM"));
			driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(datas.get(3).get("SMS"));
			driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(datas.get(3).get("IMC"));
			driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]"))
					.sendKeys(datas.get(3).get("LMC"));
			driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(datas.get(3).get("SMC"));
			driver.findElement(By.xpath("//ul[@class='actions']/li/input")).click();

		} catch (Exception e) {
		} 
	}

	@Then("^user should be display with congratulation you add Tariffplan$")
	public void user_should_be_display_with_congratulation_you_add_Tariffplan()  {
		Assert.assertTrue(
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());  
	}


	
}

