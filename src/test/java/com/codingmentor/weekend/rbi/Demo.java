package com.codingmentor.weekend.rbi;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		//run time polymorphism
		RBI loan=new ICICIBank();
		loan.homeLoanIntrest();
		loan.persoanlLoabIntrest();
		
		loan=new HDFCBank();
		loan.homeLoanIntrest();
		loan.persoanlLoabIntrest();
		
		WebDriver driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver=new EdgeDriver();
		
		driver.get("");
		
		
		
	}

}
