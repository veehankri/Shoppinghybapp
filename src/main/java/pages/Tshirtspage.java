package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirtspage {
//@FindBy(id="layered_id_attribute_group_3")
//private WebElement size;

@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[1]")
private WebElement tshirt;

public Tshirtspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void selecttshirt()
{
	//size.sendKeys(size1);
    tshirt.click();
}
}
