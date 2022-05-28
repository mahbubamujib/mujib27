package com.Stepdefination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageFactory.DressPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Practice24step {
	
	 WebDriver driver;
	 ArrayList<String> list;
//	 DressPageFactory obj;
	@Given("^User go to practice site$")
	public void user_go_to_practice_site() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	driver.get("https://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
//		obj=new DressPageFactory(driver);
			    
	}

	@When("^User click on the dresses tab$")
	public void user_click_on_the_dresses_tab() throws Throwable {
	   
		driver.findElement(By.xpath("(//*[contains(text(),'Dresses')])[5]")).click();
	    
//		obj.getDressesTab().click(); 
//			
	}

	@When("^User capture all dress price from resultset$")
	public void user_capture_all_dress_price_from_resultset() throws Throwable {
		List<WebElement> allDresses = driver.findElements(By.xpath("//*[@class='product-container']/div[2]/div[1]/span[1]"));
		list = new ArrayList<String>();
		for (int i = 0; i < allDresses.size(); i++) {
			list.add(allDresses.get(i).getText());
		}
		System.out.println(list);


		}
		
	
	
	@When("^User add to cart the second heighest price dress$")
	public void user_add_to_cart_the_second_heighest_price_dress() throws Throwable {
	  
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.get(1));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		WebElement secDress = driver.findElement(By.xpath("(//*[contains(text(),'$30.50')])[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(secDress).perform();

		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")).click();
		// Thread.sleep(5000);
		WebElement preChe = driver.findElement(By.xpath("//*[contains(text(), 'Proceed to checkout')]"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(preChe)).click();
	}

//
//	@Then("^verify total price including shippinguser verify the welcome screen$")
//	public void verify_total_price_including_shippinguser_verify_the_welcome_screen() throws Throwable {
//	   
//	    
//	}
//

	
	
	
}
	
	