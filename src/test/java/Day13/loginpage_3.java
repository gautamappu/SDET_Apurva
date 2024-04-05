package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage_3 {
	
	WebDriver driver;
	
	loginpage_3(WebDriver driver){
		this.driver=driver;
		
	}

	By logo=By.cssSelector("img[src='images/banner2.gif']");
	By user_name= By.name("userName");
	By pass_word=By.name("password");
	By submit= By.xpath("//input[@name='submit']");
	
	//actions
	public void usernameSet(String username) {
		driver.findElement(user_name).sendKeys(username);
	}
	
	public void passwordSet(String password) {
		driver.findElement(pass_word).sendKeys(password);
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}
	public Boolean checklogo() {
		 Boolean status=driver.findElement(logo).isDisplayed();
		 return status;
	 }
	

}
