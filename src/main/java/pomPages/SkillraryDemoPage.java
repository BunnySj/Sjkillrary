package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebutn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTrainingbutn;
	
	public SkillraryDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCoursebutn() {
		return coursebutn;
	}
	
	public void seleniumTrainingButton()
	{
		seleniumTrainingbutn.click();
	}
	

}