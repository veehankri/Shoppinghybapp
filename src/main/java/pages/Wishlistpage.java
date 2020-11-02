package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
	@FindBy(id="name")
	private WebElement nametab;
	
	@FindBy(id="submitWishlist")
	private WebElement savebtn;
	
	public Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void savenamewishlist(String name)
	{
		nametab.sendKeys(name);
		savebtn.click();
		
	}

}
