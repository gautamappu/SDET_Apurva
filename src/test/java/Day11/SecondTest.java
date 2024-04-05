package Day11;

import org.testng.annotations.Test;

public class SecondTest {

	@Test(priority=10)
	void Login()
	{
		System.out.println("This is login");
	}
	@Test(priority=22)
	void Search()
	{
		System.out.println("This is search");
	}
	@Test(priority=53)
	void Logout()
	{
		System.out.println("This is logout");
	}
}
