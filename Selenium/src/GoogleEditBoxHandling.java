import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleEditBoxHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.xpath(".//*[@id='lst-ib']"));
		//System.out.println(e.isDisplayed());
		//System.out.println(e.isEnabled());
		e.sendKeys("Facebook");
		Thread.sleep(3000);
		System.out.println(e.getAttribute("id"));
		System.out.println(e.getAttribute("value"));
		System.out.println(e.getAttribute("type"));
		e.clear();
		d.close();
	}

}
