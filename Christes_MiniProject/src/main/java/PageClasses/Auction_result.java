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

public class Auction_result extends PageBaseClass {

	public Auction_result(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		@FindBy(partialLinkText = "Indian, Himalayan &")
		public WebElement indianhimalayanclick;
		
		
		
		
		public indhim_Page liveauctionclick(){
			
			indianhimalayanclick.click();
			logger.log(Status.PASS, "Clicked the action link");
			System.out.println("Clicked the indian-himalayan link");
			indhim_Page pwpobject = new indhim_Page(driver, logger);
			PageFactory.initElements(driver,pwpobject);
			return pwpobject;
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
		
