package testCases;

import org.testng.annotations.Test;

public class UserLoginTest {

	
	@Test(priority=0)
	
	public void login() {
		System.out.println("Login successfully");
	}
	
	@Test(priority=1)
	
	public void homePage() {
		System.out.println("Navigate to Homepage");
	}
	
@Test(priority=2)
	
	public void addUser() {
		System.out.println("Navigate to Homepage");
	}
@Test(priority=3)

public void viewUser() {
	System.out.println("Navigate to Homepage");
}



	
	@Test(priority=3)
	
	public void logout() {
		System.out.println("Logout successfully");
	}
}
