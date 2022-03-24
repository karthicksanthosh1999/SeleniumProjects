package org.test;

import static org.testng.Assert.assertTrue;
import org.LetsCode.LogInPage;
import org.LetsCode.Seleniumbase.LetCodeBase;
import org.testng.annotations.Test;
import net.jodah.failsafe.internal.util.Assert;

public class TestLogin2 extends LetCodeBase {
	@Test
	public void LoginPage() {

		LogInPage lp = new LogInPage(driver);
		boolean enterUserLable = lp.getUserName();
		assertTrue(enterUserLable);
		boolean passWork = lp.getPassWork();
		assertTrue(passWork);

		new LogInPage(driver).enterUserName("Admin").enterPassWord("admin123").ClickButton();
	}
}
