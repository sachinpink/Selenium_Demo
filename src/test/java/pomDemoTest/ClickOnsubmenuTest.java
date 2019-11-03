package pomDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomDemo.ClickOnSubmenu;

public class ClickOnsubmenuTest 
{
	public WebDriver driver;
	ClickOnSubmenu submenu;

	
	@BeforeMethod
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void clickonSubmenus()
	{
		submenu=new ClickOnSubmenu(driver);
		submenu.clickOnSubMenus();
		
		
	}

}
