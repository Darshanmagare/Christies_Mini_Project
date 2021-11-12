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

public class Exceptional_Price extends PageBaseClass {

	public Exceptional_Price(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		@FindBy(partialLinkText = "Auction resul")
		public WebElement arclick;
		
		//@FindBy(xpath = "//li[1]//a[1]//div[1]")
		//public WebElement browseart;
		
		
		public Auction_result auctionresult(){
			
			arclick.click();
			logger.log(Status.PASS, "Clicked the Auction Result tab on left side");
			System.out.println("Clicked the Auction Result tab");
			Auction_result arobject = new Auction_result(driver, logger);
			PageFactory.initElements(driver,arobject);
			return arobject;
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
		
