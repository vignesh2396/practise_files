package com.skillsbuild;

public class CheckedExceptions02 {

	public static void main(String[] args) {

		String[] num_str = {"World", "Java", "Python", null, "Program", "Hello"};

		for (String str : num_str) {
			
			System.out.println("String: "+ str + " Length: " + (str != null ? str.length() : 0));
		}
		
	}

}