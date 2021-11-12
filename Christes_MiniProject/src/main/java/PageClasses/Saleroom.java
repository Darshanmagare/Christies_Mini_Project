package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Saleroom extends PageBaseClass {

	public Saleroom(WebDriver driver, ExtentTest logger) {
		super(driver, logger);

}
	@FindBy(xpath= "//body[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/h6[1]")
	
	public WebElement Office_details;
	
	public Saleroom clickonCity() {
		logger.log(Status.INFO, "Show Text");
		Office_details.click();
		System.out.println(Office_details.getText());
		logger.log(Status.PASS, "Show details");
		Saleroom saleroomObj = new Saleroom(driver, logger);
		PageFactory.initElements(driver, saleroomObj);
		return saleroomObj;
	}
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div[2]/div[1]/ul/li/h6")
	public WebElement firstpara;
	
	/*public void firstparagraph() {
		//firstpara.getText();
		System.out.println("first heading: "+ firstpara.getText());
	
		
	}*/
	
	public Departments gettext(){
		System.out.println("first heading: "+ firstpara.getText());
		//indianhimalayanclick.click();
		logger.log(Status.PASS, "Clicked the action link");
		System.out.println("Clicked the indian-himalayan link");
		Departments departobject = new Departments(driver, logger);
		PageFactory.initElements(driver,departobject);
		return departobject;
	}
}