package com.codingmentor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyConfig {
	
	public void myConfig() {

        Properties prop = new Properties();

        try  {
        	InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("config.properties");
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + "config.properties");
        }
        
        prop.forEach((k, v) -> System.out.println(k + " ------------ " + v));
	}

}
