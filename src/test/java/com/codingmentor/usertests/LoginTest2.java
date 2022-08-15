package com.codingmentor.usertests;

import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

import io.qameta.allure.Description;

public class LoginTest2 extends BaseTest {

	@Test
	@Description("loginTest2")
	public void loginTest2() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		loginPage.logoutApp();
	}

}
