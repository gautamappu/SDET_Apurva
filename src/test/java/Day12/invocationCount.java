package Day12;

import org.testng.annotations.Test;

public class invocationCount {
  @Test(invocationCount=10)
  public void test() {
	  System.out.println("hello");
  }
}
