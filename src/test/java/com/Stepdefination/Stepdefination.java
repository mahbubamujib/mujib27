package com.Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageFactory.Home24Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {

	
	
	WebDriver driver;
	Home24Page obj;

	@Given("^User go to orange HRM home page$")

	public void user_go_to_orange_HRM_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		obj = new Home24Page(driver);
	}

	@When("^User type the username$")
	public void user_type_the_username() throws Throwable {

		obj.getUsername().sendKeys("Admin");
	}

	@When("^User also type the password$")
	public void user_also_type_the_password() throws Throwable {
		// driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		obj.getPassword().sendKeys("admin123");

	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		// driver.findElement(By.name("Submit")).click();
		obj.getLoginBtn().click();
	}

	@Then("^User varify the welcome page$")
	public void user_varify_the_welcome_page() throws Throwable {
		String expect = "Welcome";
		String actule = obj.getWelcomeTxt().getText();
		Assert.assertTrue("welcome message is not found", actule.contains(expect));

	}

}

