import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ajax {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in/?gws_rd=ss1");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		d.findElement(By.id("lst-ib")).sendKeys("selenium tutorial");
		Thread.sleep(2000);
		
		String s=d.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul")).getText();
		System.out.println(s);
 
 String [] s1 =s.split("\n");
 for (int i=0;i<s1.length;i++)
	 
 {
	 if(s1[i].equals("selenium tutorial python"))
	 {
		 d.findElement(By.id("lst-ib")).clear();
		 Thread.sleep(2000);
		 WebElement w=d.findElement(By.id("lst-ib"));
		 w.sendKeys(s1[i]);
		 w.sendKeys(Keys.ENTER);
		 //d.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	 }
 }

	}

}
