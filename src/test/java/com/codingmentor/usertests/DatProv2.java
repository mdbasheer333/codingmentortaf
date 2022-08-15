package com.codingmentor.usertests;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codingmentor.misc.ExlDemo2;

public class DatProv2 {
	
	@Test(dataProvider = "myDataProvider")
	public void loginTest(Map<String, String> testdata) {
		System.out.println(testdata.get("name") + " " + testdata.get("city"));
		 
	}

	@DataProvider(name = "myDataProvider")
	public static Object[][] myDp() throws IOException {
		
		Map<String, String> map=new HashedMap<>();
		
		//keys should be unique
		map.put("name", "basheer");
		map.put("password", "basheer1234");
		map.put("city", "hyderabad");
		
		Object obj[][] = new Object[1][1];
		obj[0][0]=map;
		return obj;
	}

	
	
}
