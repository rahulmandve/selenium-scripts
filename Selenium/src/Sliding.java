
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliding {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://jqueryui.com/");
	d.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement e=d.findElement(By.linkText("Slider"));
	e.click();
	d.switchTo().frame(0);
	 
	WebElement e1=d.findElement(By.xpath(".//*[@id='slider']/span"));
	Actions a=new Actions(d);
	a.clickAndHold(e1).moveByOffset(150, 0).release(e1).build().perform();
	Thread.sleep(6000);
	
	d.close();
	
			}
}
