package coreAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {
	
	WebDriver driver;

	public void openUrl(String url) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamlesh.maurya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 System.out.println("Opening chrome browser");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("Url is : "+url);
     		 driver.get(url);
		 System.out.println("Open and close browser class method --> Open Url");
		 Thread.sleep(5000);
	}
	
	public void closeBrowser() throws InterruptedException{
		driver.close();
		driver.quit();
		System.out.println("Closed the browser");
	}

}
