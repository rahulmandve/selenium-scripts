import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sample {
public static void main(String[] args) throws InterruptedException  {
	
	WebDriver d=new FirefoxDriver();
	d.get("http://www.google.com");
	d.manage().window().maximize();

	String s=d.getTitle();
	System.out.println(s);
	String s1=d.getCurrentUrl();
	System.out.println(s1);
	Thread.sleep(2000);
	
	d.navigate().to("http://www.facebook.com");
	d.navigate().back();
	d.navigate().forward();
	d.navigate().refresh();
	//String s3=d.getPageSource();
	//System.out.println(s3);
	d.close(); 
	

	
}
}
