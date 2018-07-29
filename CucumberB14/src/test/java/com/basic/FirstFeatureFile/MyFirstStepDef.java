package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void ssss(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Selenium Web Driver\\geckodriver_64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("opening URL");
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name(){
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("David");
		// driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("David");
		
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present(){
		String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_j']")).getAttribute("value");
		//String userNameActual =driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
	}
	
	
}
