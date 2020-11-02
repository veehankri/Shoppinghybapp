package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
@FindBy(xpath="//a[@class='login']")
private WebElement signinbtn;

@FindBy(id="email")
private WebElement emailid;

@FindBy(id="passwd")
private WebElement pasword;

@FindBy(id="SubmitLogin")
private WebElement submit;

public Signinpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void signincredentials(String email,String password)
{
	signinbtn.click();
	emailid.sendKeys(email);
	pasword.sendKeys(password);
	submit.click();
}

}

