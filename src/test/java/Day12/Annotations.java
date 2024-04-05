package Day12;

import org.testng.annotations.*;

public class Annotations {
  @BeforeSuite
  public void login() 
  {
	  System.out.println("This is before suite...");
	  }
  @Test
  public void Search() 
  {
	  System.out.println("Search functionality...");
	  }
  @Test
  public void advancedSearch() 
  {
	  System.out.println("Advanced Search functionality...");
	  }
  @AfterSuite
  public void logout() 
  {
	  System.out.println("This is after suite...");
	  }
  
}
