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

public class showsearchresults_page extends PageBaseClass {

	public showsearchresults_page(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		@FindBy(xpath = "//chr-auction-header-actions/div[1]/div[1]/div[1]/div[3]/div[3]/chr-button[1]/a[1]/span[1]")
		public WebElement print;
		
		
		
		
		public showsearchresults_page savepdfprint(){
			
			print.click();
			logger.log(Status.PASS, "Clicked the print tab to save the file");
			System.out.println("Clicked the print tab");
			showsearchresults_page savepdf = new showsearchresults_page(driver, logger);
			PageFactory.initElements(driver,savepdf);
			return savepdf;
		}
				
	
}	
		
