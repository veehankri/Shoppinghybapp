
package genericlib.practice1;

//import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public static void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);	
	}
	
	public static void mousehover(WebDriver driver,	WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele);
	}
	public static void doubleclick(WebDriver driver )
	{
		Actions a = new Actions(driver);
		a.doubleClick();
	}
	public static void scrollbar(WebDriver driver,int X,int Y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy("+X+","+Y+")");
	}

}
