import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkHandling {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://www.google.com");
	WebElement w=d.findElement(By.linkText("Gmail"));
	System.out.println(w.isDisplayed());
	System.out.println(w.isEnabled());
	System.out.println(w.isSelected());
	d.findElement(By.partialLinkText("Gm")).click();
}
}
