package com.skillsbuild;

import java.io.IOError;

public class CheckedExceptions07 {

	public static void main(String[] args) {

		var nfe = new NumberFormatException();
		var npe = new NullPointerException();
		var ae = new ArithmeticException();

		var ioe = new IOError(new Exception());
		
		System.out.println("nfe instanceof RuntimeException: " + (
				nfe instanceof RuntimeException));

		System.out.println("npe instanceof RuntimeException: " + 
				(npe instanceof RuntimeException));
		
		System.out.println("ae instanceof RuntimeException: " + 
				(ae instanceof RuntimeException));

		System.out.println("ioe instanceof Error: " +
				(ioe instanceof Error));
	}

}