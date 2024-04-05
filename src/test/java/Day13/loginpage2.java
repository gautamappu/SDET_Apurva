package Day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//POM Class---- Page Factory
public class loginpage2 {
	WebDriver driver; //global variable
	//constructor
loginpage2(WebDriver driver) //for getting the browser name
{
	this.driver= driver;
	PageFactory.initElements(driver, this); //use for creating POM classes; here we don't use findElement();
}

@FindBy(css="img[alt='company-branding']")
WebElement logo;

@FindBy(name="username")
WebElement user_name;


//second Approach
//@FindBy(how=How.NAME,using="username")
//WebElement user_name;

@FindBy(name="password")
WebElement pass_word;

@FindBy(xpath="//button[@type='submit']")
WebElement button;
	//locate the element
//By logo=By.cssSelector("img[alt='company-branding']");
//By user_name=By.name("username");
//By pass_word= By.name("password");
//By button= By.xpath("//button[@type='submit']");

	//actions
public void setUserName(String username) 
{
	user_name.sendKeys(username);
}
public void setPasswordName(String password)
{
	pass_word.sendKeys(password);
}

public void ClickButton()
{
	button.click();
}
public Boolean checkLogo()
{
Boolean status=	logo.isDisplayed();
return status;
}
}
