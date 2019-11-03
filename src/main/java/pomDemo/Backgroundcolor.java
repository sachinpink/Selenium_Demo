package pomDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Backgroundcolor {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement blog= driver.findElement(By.xpath("//a[@href='https://www.softwaretestingmaterial.com/blog/']"));
		System.out.println("before mouseOver"+ "  "+ blog.getCssValue("background-color").toString());
		Actions act = new Actions(driver);
		act.moveToElement(blog).build().perform();
		System.out.println("after mouseOver"+" "+ blog.getCssValue("background-color").toString());
		
		
		
	}

}
