
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountGoogleLink {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.com");
	d.manage().window().maximize();
	List<WebElement> l=d.findElements(By.tagName("a"));
	System.out.println(l.size());
	
	for(int i=0;i<l.size()-1;i++)
	{
		String s=l.get(i).getText();
		System.out.println(s);
	}
	
}
}
