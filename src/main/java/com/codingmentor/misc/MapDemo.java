package com.codingmentor.misc;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map=new HashedMap<>();
		
		//keys should be unique
		map.put("name", "basheer");
		map.put("password", "basheer1234");
		map.put("city", "hyderabad");
		//map.put("city", "USa");
		
		System.out.println(map.get("name"));
		
//		System.out.println(map);
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
	}

}
