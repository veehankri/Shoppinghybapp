package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Termspage {

	@FindBy(id="cgv")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement submit;
	
	public Termspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkconditions()
	{
		checkbox.click();
		submit.click();
	}
	
}
