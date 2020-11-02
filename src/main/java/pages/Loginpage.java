package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

@FindBy(xpath="//a[@class='login']")
private WebElement signinButton;

@FindBy(id="email")
private WebElement emailaddresstab;

@FindBy(id="passwd")
private WebElement passwordtab;

@FindBy(id="SubmitLogin")
private WebElement submitbutton;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void logincredentials(String email,String password)
{
	signinButton.click();
	emailaddresstab.sendKeys(email);
	passwordtab.sendKeys(password);
	submitbutton.click();
}
}

