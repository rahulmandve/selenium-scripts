import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DateHandling {
public static void main(String[] args) throws InterruptedException 
{
	WebDriver d=new FirefoxDriver();
	d.get("http://demo.automationtesting.in/Datepicker.html");
	d.manage().window().maximize();
	Thread.sleep(3000);
		
	JavascriptExecutor j=(JavascriptExecutor)d;
	j.executeScript("document.getElementById('datepicker1').value='10/02/1991'");
	
	/*d.findElement(By.xpath("html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
	WebElement e1=d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]/a"));
	e1.click();*/
	
}
}
