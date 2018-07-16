import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class OpenNewTab
{
	
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver d =new ChromeDriver();
d.get("http://www.facebook.com");

JavascriptExecutor js = (JavascriptExecutor)d;
js.executeScript("window.open()");


Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_T);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyRelease(KeyEvent.VK_T);


d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
System.out.println(d.getTitle());

JavascriptExecutor jse=(JavascriptExecutor)d;
String s=jse.executeScript("retrun window.title").toString();
System.out.println(s);
}
}