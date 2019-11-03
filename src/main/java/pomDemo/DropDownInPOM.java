package pomDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownInPOM 
{
	WebDriver driver;
	
	public DropDownInPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='continents']")
	WebElement dropdownmenu;
	
	public void selectOptionFromDropdown(String region)
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", dropdownmenu);
		Select sel=new Select(dropdownmenu);
		sel.selectByVisibleText(region);
	}
}
