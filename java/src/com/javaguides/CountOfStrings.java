package com.javaguides;

import java.util.Scanner;

public class CountOfStrings {
    public static void main(String[] args){
        method1();
        method2();
        method3();
    }
    public static void method1(){
        System.out.println("method1");
        Scanner str = new Scanner(System.in);
        System.out.println("enter a sentence");
        String strValue = str.nextLine();
        String[] stringArray = strValue.split(" ");
        System.out.println(new StringBuilder()
                .append("No. of String in the above sentence : ")
                .append(stringArray.length));
    }
    public static void method2(){
        System.out.println("method 2");
        Scanner str = new Scanner(System.in);
        System.out.println("enter a sentence");
        String strValue = str.nextLine();
        int count = 0;
        for(String word : strValue.split(" ")) {
            count++;
        }
        System.out.println("No. of String in the above sentence : " + count);
    }
    public static void method3(){
        System.out.println("method 3");
        Scanner str = new Scanner(System.in);
        System.out.println("enter a sentence");
        String strValue = str.nextLine();
        int count = 1;
        for(int i = 0; i<strValue.length()-1;i++){
            if ((strValue.charAt(i)==' ') && (strValue.charAt(i)!=' ')){
                count++;
            }
        }
        System.out.println("No. of String in the above sentence : " + count);
    }
}
