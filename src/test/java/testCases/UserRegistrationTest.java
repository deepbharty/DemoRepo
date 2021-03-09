package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.RegistrationPage;

public class UserRegistrationTest extends Base {

	RegistrationPage regPage;

	public UserRegistrationTest(){
	             super();
	
}
	@BeforeMethod
	public void setup() {
		initialization();
		   regPage=new RegistrationPage(driver);
	}
	
	@Test
	public void register() {
		regPage.signInLink().click();
		regPage.email().sendKeys("testdata1@yopmail.com");
		regPage.createAccountButton().click();
		
		//selecting radio button
         for(int i=0; i<regPage.titleRadio().size();i++) {
			
			String name=regPage.titleRadio().get(i).getText();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Mrs.")) {
				regPage.titleRadio().get(i).click();
			}
		}
         
		
		
		
	}
	@AfterMethod
	
	public void exit() {
		//driver.quit();
	}
	
}
