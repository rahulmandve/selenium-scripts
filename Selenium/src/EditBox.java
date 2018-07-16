import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EditBox{
private static final String WebElement = null;

public static void main(String[] args) throws InterruptedException {
	
	WebDriver d=new FirefoxDriver();
	d.get("http://www.facebook.com");
	d.manage().window().maximize();
	
	Thread.sleep(2000);
/*
	d.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("rahul");
	d.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("mandve");
	d.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("9561877666");
	d.findElement(By.xpath(".//*[@id='u_0_t']")).sendKeys("rahul@123");*/
	
	WebElement wb=d.findElement(By.xpath(".//*[@id='day']"));
	Select s=new Select(wb);
	s.selectByIndex(0);

	
	WebElement wb1=d.findElement(By.xpath(".//*[@id='month']"));
	Select s1=new Select(wb1);
	s1.selectByValue("10");
	//s1.selectByVisibleText("Oct");
	//List<WebElement> l=s1.getOptions();
	
	
	WebElement wb2=d.findElement(By.id("year"));
	Select s2=new Select(wb2);
	s2.selectByVisibleText("2003");
	
	WebElement wb3=d.findElement(By.xpath(".//*[@id='u_0_8']"));
	//Select s3=new Select(wb3);
	wb3.click();
	
	//Login to fB
	
	/*d.findElement(By.xpath(".//*[@id='email']")).sendKeys("9561877666");
	d.findElement(By.xpath(".//*[@id='pass']")).sendKeys("ram@123");
	Thread.sleep(2000);
	WebElement wb=d.findElement(By.xpath(".//*[@id='loginbutton']"));

	wb.click();
	Actions a=new Actions(d);
	WebElement b=d.findElement(By.xpath(".//*[@id='navItem_100002841450835']/a/div"));
	a.moveToElement(b,130, 0).build().perform();
	a.click();*/
	
	//d.findElement(By.linkText("Edit Profile")).click();
	Thread.sleep(6000);
	//d.close();
	 

	//click on hyperlinke of fb forgatten Account
	
	//d.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
}
}
