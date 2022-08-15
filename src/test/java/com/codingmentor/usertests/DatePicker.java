package com.codingmentor.usertests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codingmentor.BaseTest;
import com.codingmentor.LoginPage;

import io.qameta.allure.Description;

public class DatePicker extends BaseTest {

	@Test
	@Description("loginTest1")
	public void loginTest1() throws InterruptedException {
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		// dates - 2 ways
		// enter date directly
		// select from calander
		
		
//		driver.findElement(By.id("datepicker2")).sendKeys("05/25/2022");
//		
//		Thread.sleep(2000);
		
		String year="2023";
		String month="February";
		String date="12";
				
		driver.findElement(By.className("imgdp")).click();
		
		boolean found=true;
		while(found) {
			String datevalue=driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(datevalue);
			
			String tempMonth=datevalue.split(" ")[0];
			String tempYear=datevalue.split(" ")[1];
			
			// logic
			
			if(datevalue.equals(month + " " + year)) {
				driver.findElement(By.linkText(date)).click();
				found=false;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		
	}

}
