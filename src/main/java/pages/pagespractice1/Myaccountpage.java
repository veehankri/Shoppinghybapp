package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.practice1.Autoconstant1;

public class Myaccountpage implements Autoconstant1 {
@FindBy(xpath="//a[@title='Women']")
private WebElement womenclothes;

@FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")
private WebElement Tshirt;

public Myaccountpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void getmyaccountpage()
{
	womenclothes.click();
	Tshirt.click();
}

}
