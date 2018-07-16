import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver d= new FirefoxDriver();
	
	d.get("https://jqueryui.com/droppable/");
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.switchTo().frame(0);
	WebElement e=d.findElement(By.xpath(".//*[@id='draggable']/p"));
	WebElement e1=d.findElement(By.xpath(".//*[@id='droppable']/p"));
	
	Actions a=new Actions(d);
	
	//a.dragAndDrop(e, e1).build().perform();
	a.clickAndHold(e).moveToElement(e1).release(e).build().perform();
	Thread.sleep(2000);
	
}
}
