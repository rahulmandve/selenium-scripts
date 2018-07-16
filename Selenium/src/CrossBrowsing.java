import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowsing{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	d.findElementByXPath("//input[@type='password']").sendKeys("rahul");
	//d.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul");
	//d.close();
	

}
}
