import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Error {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.get("http://www.firstcry.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		Thread.sleep(3000);
		
	String parent=d.getWindowHandle();
	Set<String> s=d.getWindowHandles();
	Iterator i=s.iterator();
	//int len=s.size();
while(i.hasNext())
{
		String child=i.next().toString();
		if(!child.equals(parent))
		{
			d.switchTo().window(child);
			d.close();
		}
	}
		
		d.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id='txtLUNm']")).sendKeys("rahul.mandve@yahoo");
		d.findElement(By.xpath("//*[@id='txtLPass']")).sendKeys("kjklnmnm");
		d.findElement(By.xpath("//*[@id='btnlogon']")).click();
				
	
		
	}

}

