import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FileDownloadUsingRobotClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	 WebDriver d = new FirefoxDriver();	
     d.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url
     d.manage().window().maximize();
     d.findElement(By.partialLinkText("animated")).click();	
    
     Robot r = new Robot();  // Robot class throws AWT Exception	
     Thread.sleep(2000); // Thread.sleep throws InterruptedException	
    r.keyPress(KeyEvent.VK_TAB);  // press arrow down key of keyboard to navigate and select Save radio button	
     
     Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
     r.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);
     r.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);	
     r.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);	
     //r.keyPress(KeyEvent.VK_ENTER);	
     // press enter key of keyboard to perform above selected action
	
}
}
