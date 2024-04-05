package day9;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://www.deadlinkcity.com/");
		 
	List <WebElement> link=	driver.findElements(By.tagName("a"));
	
	System.out.println(link.size());
	
	int brokenlink=0;
	
	for(WebElement linkElement:link)
	{
	String hrefValue=linkElement.getAttribute("href");
	if(hrefValue==null || hrefValue.isEmpty())
	{
		System.out.println("The href value is empty");
		continue;
	}
	
	//connection----open,send
	
	URL linkurl= new URL(hrefValue); //convert string to URL
	 HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); //sending request to server
	conn.connect();
	
	if(conn.getResponseCode()>400) //getResponseCode()----status code
	{
		
		System.out.println(hrefValue + " " +"broken link");
	    brokenlink++;
	}
	else
		System.out.println(hrefValue + " " +"not broken link");
	
	}
	System.out.println("total no. of links are :"+ brokenlink); 

	}

}