package JavaScriptExce;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.location='http://www.facebook.com';");
	}

}
