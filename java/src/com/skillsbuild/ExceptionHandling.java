package com.skillsbuild;

import java.io.IOException;

public class ExceptionHandling {
    public static void methodOne(int randomNumber) throws IOException,NullPointerException{
        if (randomNumber == 1){
            throw new IOException("IOException occured");
        } else if (randomNumber == 2){
            throw new NullPointerException("NullPointerException occured");
        }
    }
    public static void methodTwo(int randomNumber) throws IOException{
        try {
            methodOne(randomNumber);
        } catch (NullPointerException npe){

        }
    }
}
