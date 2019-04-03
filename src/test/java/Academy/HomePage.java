package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.BaseClass;

public class HomePage extends BaseClass{

	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initialize();
		driver.get("https://www.qaclickacademy.com");
		LandingPage page=new LandingPage(driver);
		//page.emailEnter("ajaykumar.kulkarni177@gmail.com");
		page.Subscription("ajaykumar.kulkarni17@gmail.com");
	}
}
