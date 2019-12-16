package datePickers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker1 {

	public static void main(String[] args) throws InterruptedException 
	{
		String Month="December,"+
	                 "\n2020";
		System.out.println("month and year need to be selected is  "+Month);
		
		String day="15";
		System.out.println("Day need to be selected is  "+day);
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/index.php");
		driver.findElement(By.xpath("//input[@id='checkin']")).click();  // date picker
		Thread.sleep(2000);
		while(true)
		{
			// here we getting current month and year
			String currentMonthandYear=driver.findElement(By.xpath("//div[@id='datepickers-container']/div[1]/nav/div[2]")).getText();
			
			//checking current month&Y are equals with and passed month&Year 
			//if its is equal then go out site of loop and click on date
			//if not equals then go then click on arrow next button to match month and year
			if(currentMonthandYear.equals(Month)) 
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='datepickers-container']/div[1]/nav/div[3]")).click();
			}
		}
		Thread.sleep(3000);
		
		// clicking on day e.g. 15
		//driver.findElement(By.xpath("//div[@id='datepickers-container']/div[1]/div/div/div[2]/div[contains(text(),'"+day+"')]")).click();
		
		
		
		

	}

}
