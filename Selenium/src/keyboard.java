import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.get("http://facebook.com");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e=d.findElement(By.xpath(".//*[@id='u_0_h']"));
		e.sendKeys("rahul");
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(3000);
		e.sendKeys(Keys.CONTROL+"v");
		
		e.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(3000);
		e.sendKeys(Keys.ARROW_LEFT);
		e.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		e.sendKeys(Keys.BACK_SPACE);
		
	}
}
