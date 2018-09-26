package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginpageTest {

	@Test
	public void Launch() {
		
		LoginPage loginpage = new LoginPage();
		loginpage.init();
		
		SoftAssert softassert = new SoftAssert();
		
		
		
	}
	
	
	@Test
	public void Flights_Click() {
		
		
		
		
	}
	
	
	
}
