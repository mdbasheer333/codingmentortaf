package com.codingmentor.usertests;

import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

import io.qameta.allure.Description;

public class LoginTest1 extends BaseTest {

	@Test
	@Description("loginTest1")
	public void loginTest1() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp();
		loginPage.logoutApp();
	}

}
