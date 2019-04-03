package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;

	public WebDriver initialize() throws IOException
	{
		Properties  prop=new Properties();
		FileInputStream str=new FileInputStream("C:\\Users\\Ajay\\SeleniumProject\\src\\main\\java\\resources\\data.properties"); 
		prop.load(str);
		String browserName=prop.getProperty("Browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	else if(browserName.equals("firefox"))
	{
		 //firefox browser
	}else if(browserName.equals("IE"))
	{
		//IE browser openinig
	}
	
	return driver;
	}
}
