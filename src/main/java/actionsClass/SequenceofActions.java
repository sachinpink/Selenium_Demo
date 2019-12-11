package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SequenceofActions {

	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement link=driver.findElement(By.xpath("//*[@id='SIvCob']/a[4]"));
		Actions act = new Actions(driver);
		act.contextClick(link)
		.keyDown( Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
