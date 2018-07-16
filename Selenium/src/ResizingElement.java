import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://jqueryui.com/resizable/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	
	d.switchTo().frame(0);
	WebElement wb=d.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	Actions a=new Actions(d);
	a.clickAndHold(wb).moveByOffset(150, 200).release(wb).build().perform();
	Thread.sleep(3000);
}
}
