package com.skillsbuild;

public class CheckedExceptions03 {

	public static void main(String[] args) {

		var numerator = 100;
		var denominator = 5;

		while (true) {
			if (denominator <= 0) break;

			int result = numerator / denominator;
			System.out.println(result);
			denominator--;
		}
		 
	}

}