
package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class ChristiesLocation extends PageBaseClass {

	public ChristiesLocation(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	//a[@class='chr-main-nav__link chr-action-bold'][contains(text(),'Locations')]
	
	@FindBy(xpath = "//a[@class='chr-main-nav__link chr-action-bold'][contains(text(),'Locations')]")
	public WebElement Location_clicked;
	
	@FindBy(xpath = "//span[contains(text(),'Dubai')]")
	public WebElement City_clicked;
	
	
	public Saleroom clickonCity() throws InterruptedException {
		
		Location_clicked.click();
		Thread.sleep(5000);
		logger.log(Status.INFO, "Clicking the cityname");
		City_clicked.click();
		logger.log(Status.PASS, "Clicked the City");
		Saleroom saleroomObj = new Saleroom(driver, logger);
		PageFactory.initElements(driver, saleroomObj);
		return saleroomObj;
	}
	
}	


