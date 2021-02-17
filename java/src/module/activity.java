package module;

import java.util.Scanner;

public class activity {
    public static void main(String[] args) {
        // activity 1 - Hello world
        System.out.println(" ----- activity 1 ----- ");
        System.out.println("Hello world");

        // activity 2 - Arithmetic operations
        System.out.println(" ----- activity 2 ----- ");
        int n1 = 10;
        int n2 = 5;
        // add
        int sum = n1 + n2;
        // sub
        int sub = n1 - n2;
        // mul
        int mul = n1 * n2;
        // div - quotient
        int div = n1 / n2;
        // modules - remainder
        int mod = n1 % n2;
        // output
        System.out.println("Number 1 : " + n1);
        System.out.println("Number 2 : " + n2);
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division : " + div);
        System.out.println("Modules : " + mod);

        // activity 3 - largest of 3 number
        System.out.println(" ----- activity 3 ----- ");
        int x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        x = in.nextInt();
        System.out.println("enter 2nd number : ");
        y = in.nextInt();
        System.out.println("enter 3rd number : ");
        z = in.nextInt();
        if (x > y && x > z) {
            System.out.println(x + " is greater");
        } else if (y > x && y > z) {
            System.out.println(y + " is greater");
        } else if (z > x && z > y) {
            System.out.println(z + " is greater");
        } else {
            System.out.println(" All are equal ");
        }
    }
}