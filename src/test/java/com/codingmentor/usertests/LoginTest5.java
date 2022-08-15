package com.codingmentor.usertests;

import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

import io.qameta.allure.Description;

public class LoginTest5 extends BaseTest {

	@Test
	@Description("loginTest4")
	public void loginTest4() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.gotoRegPage();
	}

}
