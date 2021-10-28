package TestCases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageClasses.LandingPage;
import PageClasses.Private_Sales;
import PageClasses.Signin_page;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
//import baseClasses.TopMenuClass;
//import utilities.ConstantValue;
import utilities.TestDataProvider;

public class LoginTest extends BaseTestClass{
	Signin_page Signinpage;
	LandingPage landingPage;
	Private_Sales privatesales;
	
	
	@Test(dataProvider="verifyLoginTestData", groups={"Regression", "LoginTest" })
	public void verifyLogin(Hashtable<String, String> testData){
		logger = report.createTest("Login Rediff Portfolio : " + testData.get("Comment"));
		
		invokeBrowser("Chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		Signinpage = landingPage.clickSingInLink();
		
		Signinpage.enterUser(testData.get("UserName"));
		//Signinpage .submitUserName();
		//below one line added - 5th may 2021
		Signinpage.enterPassword(testData.get("Password"));
		privatesales =Signinpage.submitLogin();
		Signinpage.verifyPasswordField();
		
	}
	
	@DataProvider
	public Object[][] verifyLoginTestData(){
		return TestDataProvider.getTestData("ChristiesLoginCred.xlsx", "Sheet1", "verifyLogin");
		
	}
	
	
}
