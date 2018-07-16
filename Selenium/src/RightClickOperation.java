import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d=new FirefoxDriver();
	d.get("http://google.com");
	d.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e=d.findElement(By.xpath(".//*[@id='lst-ib']"));
	//e.sendKeys("youtube");
	
	Actions a = new Actions(d);
//	Action a1 =
	a.contextClick(e).build().perform();
	//a1.perform();
	
	Thread.sleep(3000);
	e.sendKeys(Keys.ARROW_DOWN);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	e.sendKeys(Keys.ENTER);

}
}
