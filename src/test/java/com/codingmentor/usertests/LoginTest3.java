package com.codingmentor.usertests;

import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

public class LoginTest3 extends BaseTest {

	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		loginPage.logoutApp();
	}

}
