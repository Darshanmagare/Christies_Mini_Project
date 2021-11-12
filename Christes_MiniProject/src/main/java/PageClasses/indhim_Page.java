package PageClasses;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class indhim_Page extends PageBaseClass {

	public indhim_Page(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		
		@FindBy(id="lot-search")
		public WebElement search;
		

		
		
		
		
		
		public showsearchresults_page searchmethod() throws InterruptedException{
			
			search.sendKeys("Padmapani");
			Thread.sleep(5000);
			logger.log(Status.PASS, "Clicked the print tab to save the file");
			System.out.println("Clicked the print tab");
			showsearchresults_page s = new showsearchresults_page(driver, logger);
			PageFactory.initElements(driver,s);
			return s;
		}
				
}