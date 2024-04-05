package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//POM class- we are locating elements here and doing actions on it
public class loginPage {
	
	WebDriver driver; //global variable
	//constructor
loginPage(WebDriver driver) //for getting the browser name
{
	this.driver= driver;
}
	
	//locate the element
By logo=By.cssSelector("img[alt='company-branding']");
By user_name=By.name("username");
By pass_word= By.name("password");
By button= By.xpath("//button[@type='submit']");

	//actions
public void setUserName(String username) 
{
	driver.findElement(user_name).sendKeys(username);
}
public void setPasswordName(String password)
{
	driver.findElement(pass_word).sendKeys(password);
}

public void ClickButton()
{
	driver.findElement(button).click();
}
public boolean checkLogo()
{
Boolean status=	driver.findElement(logo).isDisplayed();
return status;
}

}
