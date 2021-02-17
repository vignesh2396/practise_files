package com.skillsbuild;

public class CheckedAndUncheckedExceptions01 {

	public static void main(String[] args) {

		String[] num_str = {"3", "56", "112", "345", "Hello", "3456"};

		for (String str : num_str) {
			
			int varInt = Integer.parseInt(str);
			
			System.out.println(varInt);
		}
		
	}

}