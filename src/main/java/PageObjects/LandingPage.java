package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
By Email=By.xpath("//*[@class='sumome-react-wysiwyg-move-handle']/div/input");
By Continue=By.xpath("//*[@class='sumome-react-wysiwyg-move-handle']/div/button");


public LandingPage(WebDriver driver)
{
	this.driver=driver;
}

public void emailEnter(String emailaddress)
{
	driver.findElement(Email).sendKeys(emailaddress);
	driver.findElement(Email).sendKeys(Keys.ENTER);
	
}
public void ContinueEnter(){
	driver.findElement(Continue).click();
	driver.findElement(Continue).sendKeys(Keys.ENTER);
}
public void Subscription(String emailaddress)
{
	this.emailEnter(emailaddress);
	this.ContinueEnter();
}
}
