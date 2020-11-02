package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luxireloginpage {
//@FindBy(id="qab_close")
//private WebElement crossbtn;

@FindBy(xpath="//a[.='Account']")
private WebElement account;

public WebElement getAccount() {
	return account;
}

@FindBy(xpath="//a[.='Login']")
private WebElement clickonlogin;

public Luxireloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//public void Luxire()
//{
////	crossbtn.click();
//}

public void Luxire1()
{
	clickonlogin.click();
}
}


