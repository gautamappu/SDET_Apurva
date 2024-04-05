package Day12;

import org.testng.annotations.Test;

//loginByEmail - sanity & regression
//loginByfacebook - sanity
//loginBytwitter - sanity
//
//signupbyemail - sanity & regression
//signupbyfacebook - regression
//signupbytwitter - regression
//
//paymentinrupees - sanity & regression
//paymentindollar - sanity
//paymentReturnbyBank - regression
public class GroupingDemo {
	@Test (priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("This is login by email");
	}
	@Test (priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("This is login by facebook");
	}
	@Test (priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("This is login by twitter");
	}
	@Test (priority=4,groups= {"sanity","regression"})
	void signupEmail()
	{
		System.out.println("This is signup by Email");
	}
	@Test (priority=5,groups= {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is signup by facebook");
	}
	@Test (priority=6,groups= {"regression"})
	void signupByTwitter()
	{
		System.out.println("This is signup by twiiter");
	}
	@Test (priority=7,groups= {"sanity","regression"})
	void paymentinRupees()
	{
		System.out.println("This is payment in rupees");
	}
	@Test (priority=8,groups= {"sanity"})
	void paymentinDollor()
	{
		System.out.println("This is payment in dollor");
	}
	@Test (priority=9,groups= {"regression"})
	void paymentReturnbyBank()
	{
		System.out.println("This is payment Return by Bank");
	}



}
