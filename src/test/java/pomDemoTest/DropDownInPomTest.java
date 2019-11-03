package pomDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomDemo.DropDownInPOM;

public class DropDownInPomTest 
{
	public WebDriver driver;
	public  DropDownInPOM drp;
	
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
	}
	
	@Test
	public void slectFromDropDown()
	{
		drp=new DropDownInPOM(driver);
		drp.selectOptionFromDropdown("Africa");
		
	}

}
