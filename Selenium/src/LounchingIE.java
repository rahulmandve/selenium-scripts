import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LounchingIE 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "F:\\Win10 Setups\\IE64bit\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", "F:\\Win10 Setups\\IE 32bit\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.manage().window().maximize();
		d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("selenium pratice");
		Thread.sleep(3000);
		d.close();
	}
}
