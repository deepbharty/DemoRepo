package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(css="a[class='login']")
	WebElement signin;
	
	@FindBy(id="email_create")
	WebElement email;
	
	@FindBy(id="SubmitCreate")
	WebElement createAnAccount;
	
	
	@FindBys({@FindBy(css="div[class='clearfix'] div[class='radio-inline']")})
	List<WebElement> title;

	
	@FindBy(id="customer_firstname")
	WebElement fname;
	
	@FindBy(id="customer_lastname")
	WebElement lname;
	
	@FindBy(id="passwd")
	WebElement password;
	
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement signInLink() {
		return signin;
	}
	
	public WebElement email() {
		return email;
	}
	public WebElement createAccountButton() {
		return createAnAccount;
	}
	
	
	public List<WebElement> titleRadio() {
		
		return title;
	}
	
	public WebElement firsrtName() {
		return fname;
	}
	
	public WebElement lastName() {
		return lname;
	}
	
	public WebElement password() {
		return lname;
	}
}
