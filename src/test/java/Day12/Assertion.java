package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void test() {
//	  
//	  int x=10;
//	  int y=20;
//	  
//	  if(x==y)
//	  {
//		  System.out.println("Test is passed");
//	  }
//	  else
//		  System.out.println("Test is failed");

	  //Assert.assertEquals(x,y); //hard assertion
	  //Assert.assertEquals(true); //passed
	 // Assert.assertEquals(false); //failed
  
  // Assert.assertTrue(true); //pass
   //Assert.assertTrue(false); //fail
//  
//  int a=10;
//  int b=20;
//  
//  //Assert.assertEquals(actual, expected, description);
//  Assert.assertEquals(a>b, true, "a is not smaller than b");
  
//	  
//	  String a1="abc";
//	  String a2="abc";
//	  
//	  Assert.assertEquals(a1,a2,"Both are equal");
 
     if(true)
    	 Assert.assertTrue(true);
     else
    	// Assert.assertFalse(false);
    	 Assert.fail();
  
  }
}
