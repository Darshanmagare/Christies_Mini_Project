package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;


public class LandingPage extends PageBaseClass {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//a[@id ='aLoginScreen']")
	public WebElement signin_click;
	

	//signin_click.click();
	public Signin_page clickSingInLink() {
		logger.log(Status.INFO, "Clicking the Signin, Present in Header");
		signin_click.click();
		logger.log(Status.PASS, "Clicked the Signin");
		Signin_page signin = new Signin_page(driver, logger);
		PageFactory.initElements(driver, signin);
		return signin;
	}


	
}
