package datePickers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		String monthYY="March 2020";
		String day="1";
		driver.findElement(By.xpath("//span[text()='Check in']/following-sibling::time[@class='dealform-button__label']")).click();
		
		while(true)
		{
			String currntMonthYYYY=driver.findElement(By.xpath("//*[@id='cal-heading-month']/span")).getText();
			if(currntMonthYYYY.equals(monthYY))
			{
				driver.findElement(By.xpath("//table[@class='cal-month']/tbody/tr/td/time/span[contains(text(),'"+day+"')]")).click();
			}
			else
			{
				driver.findElement(By.xpath("//button[@class='cal-btn-next']")).click();
			}
		}
			
		}

}
