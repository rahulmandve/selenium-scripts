package JavaScriptExce;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) 
	{
		WebDriver d= new FirefoxDriver();
		d.get("https://www.seleniumhq.org/download/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement e=d.findElement(By.partialLinkText("3.12.0"));
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("arguments[0].scrollIntoView();",e);
		a.doubleClick(e).build().perform();
	
	}

}
