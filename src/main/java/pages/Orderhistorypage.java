package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderhistorypage {
	@FindBy(xpath="//span[.='Order history and details']")
	private WebElement order;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	
	public Orderhistorypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   
	public void orderhistory()
	{
		order.click();
		logout.click();
	}
}

	