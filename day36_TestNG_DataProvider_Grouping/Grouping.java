package day36_TestNG_DataProvider_Grouping;

import org.testng.annotations.Test;

public class Grouping {
	
	/*
	 LoginByEmail  - sanity & regression
	 LoginByFacebook - sanity
	 LoginByTwitter - sanity
	 
	 signupByEmail- sanity & regression
	 signupByFacebook - sanity
	 loginByTwitter - sanity
	 
	 paymentinrupees - sanity & regression
	 paymentindollar - sanity
	 paymentReturnByBank - regression
	 
	 */
	@Test(priority=1,groups= {"sanity","regression"})
	void LoginByEmail()
	{
		System.out.println("This is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
		System.out.println("This is login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void LoginByTwitter()
	{
		System.out.println("This is login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupByEmail()
	{
		System.out.println("This is sign up by email");
	}
	
	@Test(priority=5,groups= {"sanity"})
	void signupByFacebook()
	{
		System.out.println("This is sign up by facebook");
	}
	
	@Test(priority=6,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is sign up by twitter");
	}
	
	@Test(priority=7,groups= {"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("This is payment in rupees");
	}
	
	@Test(priority=8,groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("This is payment in dollar");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnByBank()
	{
		System.out.println("This is payment returned by bank");
	}

}
