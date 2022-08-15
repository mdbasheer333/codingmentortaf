package com.codingmentor.usertests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codingmentor.misc.ExlDemo2;

public class DatProv {
	
	@Test(dataProvider = "myDataProvider")
	public void loginTest(String userName, String password, String nickname, String city) {
		System.out.println("userName " + userName + " and password " + password + " nickkname " + nickname + " city " + city);
	}

	@DataProvider(name = "myDataProvider")
	public static Object[][] myDp() throws IOException {
		ExlDemo2 demo=new ExlDemo2();
		Object obj[][] = demo.getDataFromExcelSheet();
		return obj;
	}

	
	
}
