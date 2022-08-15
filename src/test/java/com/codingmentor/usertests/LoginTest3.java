package com.codingmentor.usertests;

import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

import io.qameta.allure.Description;

public class LoginTest3 extends BaseTest {

	@Test
	@Description("loginTest3")
	public void loginTest3() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		loginPage.logoutApp();
	}

}
