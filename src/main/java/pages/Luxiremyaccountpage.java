package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luxiremyaccountpage {
@FindBy(xpath="(//a[.='Account'])[2]")
private WebElement accountsignout;

public WebElement getAccountsignout() {
	return accountsignout;
}

@FindBy(xpath="//a[.='Logout']")
private WebElement loggout;

public Luxiremyaccountpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void luxaccount()
{
	loggout.click();
}
	
}



