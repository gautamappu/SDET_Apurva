package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardvssoftAssertions {
  //@Test
   void HardAssertions() {
	  
	  System.out.println("Testing......");
	  System.out.println("Testing......");
	  System.out.println("Testing......");
	  System.out.println("Testing......");

      Assert.assertTrue(true); //passed
      
      System.out.println("This is example of hard assertion");
	  
      }
   @Test
   void softAssertion() {
	   System.out.println("Testing......");
		  System.out.println("Testing......");
		  System.out.println("Testing......");
		  System.out.println("Testing......");

		  SoftAssert sa= new SoftAssert();
		  
	      sa.assertTrue(false); //passed
	      
	      System.out.println("This is example of soft assertion");
	      sa.assertTrue(true);
	      sa.assertTrue(true);
	      sa.assertTrue(true);
   
	      sa.assertAll(); //required
   }
}
