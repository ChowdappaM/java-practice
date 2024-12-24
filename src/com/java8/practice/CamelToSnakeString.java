package com.java8.practice;

public class CamelToSnakeString {

	public static void main(String[] args) {
		CamelToSnakeString obj = new CamelToSnakeString();
		System.out.println(obj.convertCamelToSnakeString("HelloWorldFromSnakeGame!"));
	}

	public String convertCamelToSnakeString(String input) {
		
		if(input == null || input.length()==0) {
			return "";	
		}
		if(input.length() ==0) {
			return input.toLowerCase();
		}
		
		String subStrs[] = input.split("(?=\\p{Lu})");
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(subStrs[0].toLowerCase());
		for(int i = 1; i<subStrs.length; i++) {
			strBuilder.append("_"+subStrs[i].toLowerCase());
		}
		
		return strBuilder.toString();
	}
}


