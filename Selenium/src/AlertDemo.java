
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("http://www.rediff.com");
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.findElement(By.linkText("Sign in")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath(".//*[@id='login1']")).sendKeys("rahul");
	d.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	
	Alert a=d.switchTo().alert();
	String s=a.getText();
	Thread.sleep(3000);
	a.dismiss();//if pop-up message contains cancele and ok then this method click on cancele button
	//a.accept(); //it click on ok button
	//Thread.sleep(2000);
}
}
