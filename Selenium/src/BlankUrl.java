import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlankUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.close();
	}

}
