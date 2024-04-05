package Day12;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependentMethods {
  @Test(priority=1)
  public void openUrl() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2, dependsOnMethods= {"openUrl"})
  public void login() {
	  Assert.assertTrue(false);
  }
  
  @Test(priority=3, dependsOnMethods= {"login"})
  public void search() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=4,dependsOnMethods= {"login","search"})
  public void advanceSearch() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=5)
  public void logout() {
	  Assert.assertTrue(true);
  }
  
  
}
