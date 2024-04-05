package Day12;

import org.testng.annotations.*;

public class allAnnotations {

	@BeforeMethod
	
	public void start()
	{
	System.out.println("Start...");

	}
	
	@BeforeClass
	public void start1()
	{
	System.out.println("Start1...");

	}
	@BeforeTest
	public void start2()
	{
	System.out.println("Start2...");

	}
	@BeforeSuite
	public void start4()
	{
	System.out.println("Start4...");

	}
	
@Test
	public void display()
	{
	System.out.println("hello ...");

	}
	
@Test
	public void show ()
	{
	System.out.println(" java world...");

	}
	
@AfterMethod

	public void end1()
	{
	System.out.println("Ending1...");

	}

@BeforeClass
public void end2()
{
System.out.println("ending2...");

}
@AfterTest
public void end3()
{
System.out.println("Ending3...");

}
@AfterSuite
public void end4()
{
System.out.println("Ending4...");

}

}
