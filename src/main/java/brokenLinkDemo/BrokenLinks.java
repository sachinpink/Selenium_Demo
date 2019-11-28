package brokenLinkDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks
{

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for()

	}

}
