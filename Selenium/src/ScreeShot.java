import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreeShot {
public static void main(String[] args) {
	WebDriver d=new FirefoxDriver();
	d.get("http://www.gmail.com");
	d.manage().window().maximize();
	
	try {
		
		TakesScreenshot t=(TakesScreenshot)d;
		File f=t.getScreenshotAs(OutputType.FILE);
		String dr="C:\\Users\\hp\\Desktop\\VideoRec/egmail.png";
		File dest=new File(dr);
		org.apache.commons.io.FileUtils.copyFile(f,dest);
		System.out.println("screenshot taken");
		
		/*File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Desktop\\VideoRec/egmail.png"));
		*/
	} catch (Exception e) {
		System.out.println(e);
	} 	
}
}
