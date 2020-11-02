package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
  @FindBy(xpath="//a[@class='bankwire']")
  private WebElement clickpay;
  
  public Paymentpage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void payment()
  {
	  clickpay.click();
  }
	
}
