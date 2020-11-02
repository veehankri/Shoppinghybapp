package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luxireregisteredcustomers {
@FindBy(id="CustomerEmail")
private WebElement custemail;

@FindBy(id="CustomerPassword")
private WebElement custpass;

@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement submit;

public Luxireregisteredcustomers(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void luxirecustomers(String email,String password)
{
	custemail.sendKeys(email);
	custpass.sendKeys(password);	
}

public void luxirecustomers1()
{
	submit.click();
}
}
