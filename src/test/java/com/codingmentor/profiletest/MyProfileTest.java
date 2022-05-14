package com.codingmentor.profiletest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.codingmentor.MyConfig;

public class MyProfileTest {

	@Test
	public void myProfileTest() {
		MyConfig mc=new MyConfig();
		mc.myConfig();
	}
	
}
