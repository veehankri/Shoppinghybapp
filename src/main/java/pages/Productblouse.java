package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productblouse {
 @FindBy(id="search_query_top")
 private WebElement blousesearch;
 
 @FindBy(xpath="(//button[@type='submit'])[1]")
 private WebElement search;
 
 @FindBy(xpath="(//a[@title='Blouse'])[1]")
 private WebElement blouse;
 
 @FindBy(xpath="//span[.='Add to cart']")
 private WebElement addcart;
 
 @FindBy(xpath="//a[@title='Proceed to checkout']")
 private WebElement checkout;
 
 @FindBy(xpath="//a[@class='logout']")
 private WebElement signout;
 
 public Productblouse(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void blouse()
 {
   search.click();
   blouse.click();
   addcart.click();
   checkout.click();
   signout.click();
 }
 
 public void blousename(String Prodname)
 {
	   blousesearch.sendKeys(Prodname);
 }
 }
   
 

