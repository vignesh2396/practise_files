import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {

        System.out.print("Enter the year to check if it is a leap year or not : ");

        Scanner yearInput = new Scanner(System.in);

        int year = yearInput.nextInt();

        yearInput.close();

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    System.out.println(year + " is a leap year");

                } else {

                    System.out.println(year + " is not a leap year");

                }

            } else {

                System.out.println(year + " is a leap year");

            }
            
        } else {

            System.out.println(year + " is not a leap year");

        }
		
    }

}