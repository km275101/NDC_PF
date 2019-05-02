package defineStep;

import org.junit.Test;
import coreAction.Initialize;
import cucumber.api.java.en.Given;

public class StepExplaination extends Initialize{

	@Test
	@Given("^users login page$")
	public void users_login_page() throws Throwable {
		 ocb.openUrl("http://www.irctc.co.in");
		 ocb.closeBrowser();
		 login.test();
	}
}
