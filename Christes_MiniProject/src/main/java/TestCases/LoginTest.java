package TestCases;

import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.Auction_result;
import PageClasses.ChristiesLocation;
import PageClasses.Departments;
import PageClasses.Exceptional_Price;
import PageClasses.LandingPage;
import PageClasses.indhim_Page;
import PageClasses.Private_Sales;
import PageClasses.Saleroom;
import PageClasses.showsearchresults_page;
import PageClasses.Signin_page;
import PageClasses.Specialist_Dept;
import PageClasses.Stories_page;
import PageClasses.indianarttype;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
//import baseClasses.TopMenuClass;
//import utilities.ConstantValue;
import utilities.TestDataProvider;

public class LoginTest extends BaseTestClass{
	ChristiesLocation location;
	Saleroom saleroomObj;
	Signin_page Signinpage;
	LandingPage landingPage;
	Private_Sales privatesales;
	Departments departobject;
	Stories_page storiesobj;
	Specialist_Dept spec_dept;
	indianarttype indianart;
	Exceptional_Price epobject;
	Auction_result arobject;
	indhim_Page pwpobject;
	
	showsearchresults_page s;
	
	@Test(dataProvider="verifyLoginTestData", groups={"Regression", "LoginTest" })
	public void verifyLogin(Hashtable<String, String> testData) throws InterruptedException{
		logger = report.createTest("Login Rediff Portfolio : " + testData.get("Comment"));
		
		invokeBrowser("Chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		landingPage = pageBase.allowcookies();//added line foe cookies
		Signinpage = landingPage.clickSingInLink();
		
		Signinpage.enterUser(testData.get("UserName"));
		Thread.sleep(5000);
		//Signinpage .submitUserName();
		//below one line added - 5th may 2021
		Signinpage.enterPassword(testData.get("Password"));
		Signinpage.verifyPasswordField();
		//commented to check department class//privatesales =Signinpage.submitLogin();
		location=Signinpage.saleroomclick();
		//departobject=Signinpage.submitLogin();
		Thread.sleep(5000);
		saleroomObj=location.clickonCity();
		Thread.sleep(5000);
		departobject=saleroomObj.gettext();
				
		spec_dept=departobject.deptclick();
		Thread.sleep(5000);
		indianart=spec_dept.arttypeclick();
		Thread.sleep(5000);
		epobject=indianart.epclick();
		Thread.sleep(5000);
		arobject=epobject.auctionresult();
		Thread.sleep(5000);
		pwpobject=arobject.liveauctionclick();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(5000);
		s=pwpobject.searchmethod();
		Thread.sleep(5000);
		
		
		
	}
	
	@DataProvider
	public Object[][] verifyLoginTestData(){
		return TestDataProvider.getTestData("ChristiesLoginCred.xlsx", "Sheet1", "verifyLogin");
		
	}
	
	
}
