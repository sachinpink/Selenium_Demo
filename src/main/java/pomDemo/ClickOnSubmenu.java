package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnSubmenu
{
	WebDriver driver;
	public ClickOnSubmenu(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Tutorial']")
	WebElement Tutorial_Menu;
	
	@FindBy(xpath="//span[text()='Software Testing Tutorial']")
	WebElement SoftTestingTutMenu;
	
	@FindBy(xpath="//span[text()='Agile & Scrum']")
	WebElement AgileScrumMenu;
	
	public void clickOnSubMenus()
	{
		Actions act =new Actions(driver);
		act.moveToElement(Tutorial_Menu);
		act.moveToElement(AgileScrumMenu).click().build().perform();
		
	}
	

}
