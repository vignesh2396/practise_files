import java.util.Scanner;

public class MyClass05 {
	
	public static void main(String[] args) {

        System.out.print("Enter first name : ");

        Scanner nameInput1 = new Scanner(System.in);

        String name1 = nameInput1.nextLine();

        String name2 = name1;

        String name3 = new String(name1);

        if (name1.equals(name2)) {

            System.out.println(name1 + " and " + name2 + " are equal");

        } else {

            System.out.println(name1 + " and " + name2 + " are not equal");

        }

        nameInput1.close();
		
	}

}