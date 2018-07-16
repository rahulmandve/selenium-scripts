import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CountFrameOnPage {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/draggable/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//List<WebElement>l=d.findElements(By.tagName("iframe"));

		JavascriptExecutor e=(JavascriptExecutor)d;
		List l = (List)e.executeScript("return document.getElementsByTagName('iframe');");
		String title=e.executeScript("return document.title;").toString();
		System.out.println(title);
		System.out.println(l.size());
		e.executeScript("window.scrollBy(0,200)");
		
		
	}

}
