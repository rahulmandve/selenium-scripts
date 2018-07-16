import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("http://toolsqa.com/automation-practice-form/");
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.findElement(By.partialLinkText("Partial")).click();;
	d.findElement(By.linkText("Link Test"));
	d.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("rahul");
	d.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("mandve");
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("scroll(0,1000)");

	WebElement e1=d.findElement(By.name("sex"));
	e1.click();
	Thread.sleep(6000);
	d.findElement(By.xpath(".//*[@id='exp-4']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("02/10/1991");
	
	d.findElement(By.xpath(".//*[@id='profession-1']")).click();
	//file Upload
	WebElement wb=d.findElement(By.xpath(".//*[@id='photo']"));
	wb.sendKeys("G:\notes\t.docx");
	
	Thread.sleep(5000);
	d.findElement(By.partialLinkText("Hybrid Framework")).click();
	d.findElement(By.linkText("Test File to Download"));
	d.findElement(By.xpath(".//*[@id='tool-1']")).click();
	
	WebElement e=d.findElement(By.xpath(".//*[@id='continents']"));
	Select s=new Select(e);
	s.selectByVisibleText("Antartica");
	
	d.findElement(By.xpath(".//*[@id='submit']")).click();
	
	 			
	
}
}
