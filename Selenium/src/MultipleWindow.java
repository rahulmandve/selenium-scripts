import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new FirefoxDriver();
		d.get("https://www.naukri.com/");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		String top = d.getWindowHandle();
		Set<String>s = d.getWindowHandles();
		System.out.println(s);
		System.out.println(top+"parent");

		Iterator it = s.iterator();
		while(it.hasNext())
		{
			String 	Cwnd = it.next().toString();
			if(!Cwnd.equals(top))
			{
				d.switchTo().window(Cwnd);
				d.close();
				Thread.sleep(3000);
			}
		}

	}

}
