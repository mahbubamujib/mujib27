package hrmcountry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMcountry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
	}

}
