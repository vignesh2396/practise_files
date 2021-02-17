import java.util.Scanner;

public class MyClass08 {

    public static void main(String[] args) {

        System.out.print("Enter a month index between 1 to 12: ");

        Scanner monthInput = new Scanner(System.in);

        int month = monthInput.nextInt();
        
        switch (month) {
        
        case 3: 
                
        case 6:  
                
        case 9: 
                
        case 12: 

            System.out.println(month + " is a quarter end month"); 
            break;  
                
        default:
        
            System.out.println(month + " is not a quarter end month"); 
            break;
            
        }  
        
        monthInput.close();

    }

}