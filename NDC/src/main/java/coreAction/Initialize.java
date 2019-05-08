package coreAction;

import org.openqa.selenium.support.PageFactory;
import pageFunctions.LoginTestPF;

public class Initialize extends OpenAndCloseBrowser{

	protected LoginTestPF lpf = PageFactory.initElements(driver, LoginTestPF.class);
	
	/*@BeforeMethod
	public void initialize() {
		lpf = PageFactory.initElements(driver, LoginTestPF.class);;
		//lpf = new LoginTestPF(driver);
		//pageFunctions.LoginTestPF@64b70919
	}*/
	 
	
}
