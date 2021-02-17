package module;

import java.util.Scanner;

public class fibonacci_series {

    // variable declaration
    static int n1 = 0, n2 = 1, n3 = 0;

    // function creation
    static void fibonacci(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            fibonacci(count-1);
        }
    }

    // main
    public static void main(String[] args){

        // method 1
        System.out.println("----- fibonacci series ---- ");
        System.out.println("----- method 1 ---- ");
        int n;
        Scanner in = new Scanner(System.in);

        // getting user input
        System.out.println("Enter number of fibonacci series to print : ");
        n = in.nextInt();

        // printing first 2 value
        System.out.println(" " + n1 + " \n " + n2);

        // calling the function
        fibonacci(n-2);

        // without using function
        System.out.println("----- method 2 ---- ");

        System.out.println(n1 + "\n" + n2);
        for(int i=2; i<n; ++i){
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
