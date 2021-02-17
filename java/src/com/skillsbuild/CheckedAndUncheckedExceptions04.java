package com.skillsbuild;

import java.io.IOError;

public class CheckedAndUncheckedExceptions04 {

	public static void main(String[] args) {
		
		methodWhichThrowsAnError();
	}
	
	public static void methodWhichThrowsAnError() throws IOError {

		throw new IOError(new Exception());
	}

}