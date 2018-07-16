
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class FileUploadUsigRobotClass {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver d=new FirefoxDriver();
	d.get("http://my.monsterindia.com/create_account.html?r=1522583344&src=");
	d.manage().window().maximize();
	Thread.sleep(2000);
	
	d.findElement(By.xpath(".//*[@id='wordresume']")).click();
	Thread.sleep(2000);
	
	Robot r=new Robot();
	
	StringSelection s=new StringSelection("C:\\Users\\hp\\Downloads\\Rahul Testing CV.doc");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	//Toolkit is abstract class, getDefaultToolkit() is static method,getSystemClipboard() is abstract method,setContents() it take 
	//two args(Transferable contents(s), ClipboardOwner owner(null))
	
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	d.close();
	
	
	
}
}
