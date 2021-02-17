package com.skillsbuild;

import java.util.Scanner;

public class Car06 {

	public static void main(String[] args) {

        System.out.print("Enter the price of the car in dollars : ");

        Scanner priceInput = new Scanner(System.in);

        int price = priceInput.nextInt();

        priceInput.close();

        System.out.println("Price : "+price);

        if (price <= 10000) {

            if (price < 5000) {

                System.out.println("Car price is below 5000");

            } else {

                System.out.println("Car price is between 5000 to 10000");
                
            }

        } else if (price > 10000 && price <= 20000) {

            System.out.println("It's a moderately priced car");

        } else if (price > 20000 && price <= 42000) {

            System.out.println("It's a slightly expensive car");

        } else {

            System.out.println("It's very expensive");

        }
        
	}

}