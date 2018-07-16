package JavaScriptExce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.facebook.com");
	WebElement e=d.findElement(By.id("loginbutton"));
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click()",e);
		
	}

}
