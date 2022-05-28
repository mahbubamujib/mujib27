package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DressPageFactory {

	WebDriver driver;

	public DressPageFactory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dresses')])[5]")
	private WebElement dressesTab;

	public WebElement getDressesTab() {
		return dressesTab;
	}
	public void setDressesTab(WebElement dressesTab) {
		this.dressesTab = dressesTab;
	}
	@FindBy(how = How.XPATH, using = "//*[@class='product-container']/div[2]/div[1]/span[1]")
			
	private WebElement resultSet;

	public WebElement getResultSet() {
		return resultSet;
	}
	public void setResultSet(WebElement resultSet) {
		this.resultSet = resultSet;
	}
	@FindBy(how=How.XPATH, using="//*//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")
	
	private WebElement secondhieghest;

	public WebElement getSecondhieghest() {
		return secondhieghest;
	}
	public void setSecondhieghest(WebElement secondhieghest) {
		this.secondhieghest = secondhieghest;
	}


}








