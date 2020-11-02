package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
//	
//	@FindBy(id="search_query_top")
//	private WebElement searchtb;
//	
//	@FindBy(name="submit_search")
//	private WebElement go;
//	
//	@FindBy(xpath="//span[.='My wishlists']")
//	private WebElement wishlistbtn;
//	
//	public Homepage(WebDriver driver)
//	{
//		PageFactory.initElements(driver,this);
//	}
//	
//	public void searchProduct(String productname)
//	{
//		searchtb.sendKeys(productname);
//		go.click();
//	}
//	
//	public void wishlistbutton()
//	{
//		wishlistbtn.click();
//	}
//	
//}
	
	
	 @FindBy(id="search_query_top")
	 private WebElement searchtb;
	 
	 @FindBy(name="submit_search")
	 private WebElement go;
	 
	 @FindBy(xpath="//span[.='My wishlists']")
	 private WebElement wishlistbtn;
	 
	 public Homepage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
	 }

//	public void HomePage(WebDriver driver)
//	 {
//	  PageFactory.initElements(driver,this);
//	 }
	 
	 public void searchProduct(String productname)
	 {
	  searchtb.sendKeys(productname);
	  go.click();
	 }
	 
	 public void wishlistbutton()
	 {
		 wishlistbtn.click();
	 }

	 }


