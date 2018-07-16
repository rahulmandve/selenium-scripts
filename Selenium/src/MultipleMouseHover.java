import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleMouseHover {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://www.unipune.ac.in/");
	Thread.sleep(2000);
	WebElement e=d.findElement(By.id("stUI42_txt"));
	Actions a=new Actions(d);
	a.moveToElement(e).build().perform();
	WebElement e1=d.findElement(By.xpath(".//*[@id='stUI44_txt']"));
	a.moveToElement(e1).build().perform();
	Thread.sleep(3000);
	d.close();
}
}
