package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class indianarttype extends PageBaseClass {

	public indianarttype(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}	
		
		@FindBy(partialLinkText = "Exceptional pric")
		public WebElement excep_price;
		
		
		public Exceptional_Price epclick(){
			
			excep_price.click();
			logger.log(Status.PASS, "Clicked the exceptional price on left side");
			System.out.println("Clicked the exceptional price");
			Exceptional_Price epobject = new Exceptional_Price(driver, logger);
			PageFactory.initElements(driver,epobject);
			return epobject;
		}
			
		
		
		
		
		
		/*public Stories_page get()
		{
			navigationbar.click();
			indianart.click();
			browseart.click();
			
			Stories_page storiesobj = new Stories_page(driver, logger);
			PageFactory.initElements(driver, storiesobj);
			return storiesobj;
		}*/
}	
		
