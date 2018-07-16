import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.carmax.com/");
	d.manage().window().maximize();
	
	Actions a=new Actions(d);
	WebElement w=d.findElement(By.xpath(".//*[@id='buysMenu']/a"));
	Thread.sleep(2000);
	a.moveToElement(w).build().perform();
	Thread.sleep(3000);
	d.findElement(By.partialLinkText("Why")).click();
	

	
}
}
