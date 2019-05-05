package pageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageElements.LoginTestPE;

public class LoginTestPF extends LoginTestPE{
	 
	
	
	public LoginTestPF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String strUser) {
		System.out.println("Sending username");
		userName.sendKeys(strUser);
	}
 
	public void setPass(String strPass) {
		System.out.println("Sending password");
		password.clear();
		password.sendKeys(strPass);
	}
	
    public void clickLogin() throws InterruptedException {
    	System.out.println("clicking submit button");
		submit.click();
		Thread.sleep(10000);
	}
	
    public void clickYourOrders() {
		try {
			//mouseHover(yourOrders);
			/*
			 * Actions action = new Actions(driver);
			 * System.out.println("Start move to element"); Thread.sleep(5000);
			 * action.moveToElement(yourOrders).build().perform();
			 */
			System.out.println("Click on your order button");
			Thread.sleep(5000);
			yourOrders.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
}
