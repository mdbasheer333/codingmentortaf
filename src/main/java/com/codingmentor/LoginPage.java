package com.codingmentor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.Annotations;

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
	
	@FindBy(xpath = "//div[@id='gender']/descendant::label[text()='%gender%']")
	private WebElement rdBtnGender;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void loginToApp() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		txtEmail.sendKeys("bash1234@gmail.com");
		txtPassword.sendKeys("123456");
		btnLogIn.click();
	}
	
	public void gotoRegPage() throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		this.rdBtnGender.getClass().asSubclass(RemoteWebElement.class).getDeclaredAnnotation(FindBy.class).xpath().replace("%gender%", "Female");
		
		//rdBtnGender.getClass().getDeclaredAnnotation(FindBy.class).xpath().replace("%gender%", "Female");
		rdBtnGender.click();
		Thread.sleep(5000);
		rdBtnGender.getClass().getDeclaredAnnotation(FindBy.class).xpath().replace("%gender%", "Male");
		rdBtnGender.click();
		Thread.sleep(5000);
	}
	
	public void logoutApp() {
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(lnkLogout));
		//lnkLogout.click();
	}
	
	

}
