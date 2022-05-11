package com.codingmentor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "Email")
	private WebElement txtEmail;

	@FindBy(name = "Password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement btnLogIn;

	@FindBy(linkText = "Log out")
	private WebElement lnkLogout;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void loginToApp() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		txtEmail.sendKeys("bash1234@gmail.com");
		txtPassword.sendKeys("123456");
		btnLogIn.click();
	}

	public void logoutApp() {
		lnkLogout.click();
	}

}
