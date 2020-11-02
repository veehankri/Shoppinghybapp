package pages.pagespractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.Autoconstant;

public class Productpage implements Autoconstant{
	@FindBy(xpath="//i[@class=\"icon-plus\"]")
	private WebElement plusbtn;
	
	@FindBy(xpath="//select[@id=\"group_1\"]")
	private WebElement sizebtn;

    public WebElement getSizebtn() {
		return sizebtn;
	}

public Productpage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void plus()
{
	plusbtn.click();	
}
}
