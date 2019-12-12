package datePickers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerUsingJSE 
{
	public WebDriver driver;
	String checkInDate="11/12/2019";
	String  checkOutDate ="13/12/2019";
	
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.phptravels.net/index.php");
	}
	public void selectCity() throws InterruptedException
	{
		WebElement city=driver.findElement(By.xpath("//*[@id='s2id_autogen1']/a/span[1]"));
		city.click();
		Thread.sleep(1000);
		city.sendKeys("Pune");
		city.sendKeys(Keys.ENTER);
		System.out.println("city is selected");
	}
	
	public void selectCheckInDate()
	{
		
      WebElement chekIndateTxt=driver.findElement(By.xpath("//input[@id='checkin']"));
      JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value','"+checkInDate+"');", chekIndateTxt);
	  System.out.println("check in date is selected");
	  
	}
	public void selectCheckOutDate()
	{
		
      WebElement checkOutdateTxt=driver.findElement(By.xpath("//*[@id='checkout']"));
      JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('value','"+checkOutDate+"');",checkOutdateTxt);
	  System.out.println("check out date is selected");
	}
	public void clickonsearch()
	{
		driver.findElement(By.xpath("//*[@id='hotels']/div/div/form/div/div/div[4]/button")).click();
		System.out.println("clicked on search");
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		DatePickerUsingJSE picker= new DatePickerUsingJSE();
		picker.setup();
		picker.selectCity();
		picker.selectCheckInDate();
		picker.selectCheckOutDate();
		picker.clickonsearch();
		
		
		
	}

}
