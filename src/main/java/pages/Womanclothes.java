package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womanclothes {
@FindBy(xpath="//a[@title='Women']")
private WebElement women;

public WebElement getWomen() {
	return women;
}

@FindBy(xpath="(//a[@title='T-shirts'])[1]")
private WebElement tshirts;

public Womanclothes(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void womantshirts()
{
	tshirts.click();
}

}
