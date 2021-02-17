import java.util.Scanner;

public class MyClass03 {

    public static void main(String[] args) {

        System.out.print("Enter a number : ");

        Scanner numInput = new Scanner(System.in);

        int num = numInput.nextInt();

        numInput.close();

        if (num == 0) {

            System.out.println("Number is zero");

        } else {

            if (num > 0) {

                System.out.println(num + " is positive");

            } else {

                System.out.println(num + " is negative");

            }

        }
		
    }

}