import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://jqueryui.com/");
	d.manage().window().maximize();
	d.findElement(By.linkText("Slider")).click();
	d.findElement(By.xpath(".//*[@id='content']/div[1]/ul/li[11]/a")).click();
	Thread.sleep(3000);
	//JavascriptExecutor j=(JavascriptExecutor)d;
	//j.executeScript("scroll(0,1000)");
	d.switchTo().frame(0);
	
	WebElement e=d.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
	
	Actions a=new Actions(d);
	a.clickAndHold(e).moveByOffset(0,51).release(e).build().perform();
	Thread.sleep(6000);
}
}
