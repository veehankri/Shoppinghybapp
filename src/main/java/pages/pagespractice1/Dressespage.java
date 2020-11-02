package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.practice1.Autoconstant1;

public class Dressespage implements Autoconstant1 {
@FindBy(xpath="(//a[@title=\"Dresses\"])[2]")
private WebElement dreses;

public WebElement getDreses() {
	return dreses;
}

public Dressespage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}


