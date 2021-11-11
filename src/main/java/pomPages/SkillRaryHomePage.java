package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryHomePage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbutn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement skillrarydemoapp;
	
	public SkillRaryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gearsButton()
	{
		gearbutn.click();
	}
	public void skillraryDemoApplication() 
	{
		skillrarydemoapp.click();
	}

}