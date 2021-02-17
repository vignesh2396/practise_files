import java.util.Scanner;

public class MyClass02 {

    public static void main(String[] args) {

        char grade;

        System.out.print("Enter the test score : ");

        Scanner scoreInput = new Scanner(System.in);

        int testScore = scoreInput.nextInt();

        scoreInput.close();

        if (testScore >= 90) {

            grade = 'A';

        } else if (testScore >= 80) {

            grade = 'B';

        } else if (testScore >= 70) {

            grade = 'C';

        } else if (testScore >= 60) {

            grade = 'D';

        } else {

            grade = 'F';
        }

        System.out.println("Score = " + testScore + " Grade = " + grade);
		
    }

}