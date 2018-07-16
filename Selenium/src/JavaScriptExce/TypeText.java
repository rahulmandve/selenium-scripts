package JavaScriptExce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TypeText {

	public static final void main(String[] args) {
		//main(10);

	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://www.facebook.com");
	JavascriptExecutor js=(JavascriptExecutor)d;
	//js.executeScript("history.exit(0)");
	 	//js.executeScript("document.getElementById('email').value='9561877666';");

	js.executeScript("document.getElementById('email').value='9561877666';");
	js.executeScript("document.getElementById('pass').value='ram@123';");
	js.executeScript("window.scrollBy(0,200)");
	//WebElement e=d.findElement(By.id("loginbutton"));
	//js.executeScript("arguments[0].click();", e);
	//WebElement e=d.findElement(By.id("lst-ib"));
	//e.submit();

}
public static void main(int args) {
	System.out.println("hiiiii");
	
}
}
