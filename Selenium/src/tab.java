import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tab {
	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		System.out.println(d.getCurrentUrl());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		d.get("http://www.google.com");
		System.out.println(d.getCurrentUrl());
		//d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
		System.out.println(d.getCurrentUrl());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		d.get("http://www.rediffmail.com");
		System.out.println(d.getCurrentUrl());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
		System.out.println(d.getCurrentUrl());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
		System.out.println(d.getCurrentUrl());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
		System.out.println(d.getCurrentUrl());
		

	}

}
