package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddCartPage;
import pomPages.SkillRaryHomePage;
import pomPages.SkillraryDemoPage;

public class AddToCart extends BaseClass{
	
	@Test
	public void tc1() throws FileNotFoundException, IOException
	{
		SkillRaryHomePage s=new SkillRaryHomePage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoPage h=new SkillraryDemoPage(driver);
		utilies.mouseHover(driver, h.getCoursebutn());
		h.seleniumTrainingButton();
		
		AddCartPage c=new AddCartPage(driver);
		utilies.doubleClick(driver,c.getPlusbutn());
		c.addtocartButton();
		utilies.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("AddToCartTitle"));
		Reporter.log(driver.getTitle(),true);
		
	}

}
