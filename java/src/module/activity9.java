package module;
import java.util.Arrays;
import java.util.Scanner;
public class activity9 {
    public static void main(String args[]){
        int no_of_element,element_to_delete,flag=1, location = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        no_of_element = input.nextInt();
        int array_of_element[] = new int[no_of_element];
        System.out.println("Enter all the element");
        for(int i=0; i<no_of_element; i++){
            array_of_element[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array_of_element));
        System.out.println("Enter the element you want to delete");
        element_to_delete = input.nextInt();
        for (int i = 0; i< no_of_element; i++){
            if(array_of_element[i] == element_to_delete){
                flag = 1;
                location = i;
                break;
            }
            else{
                flag =0;
            }
        }
        if(flag == 1){
            for(int i = location+1; i<no_of_element; i++){
                array_of_element[i-1] = array_of_element[i];
            }

            System.out.println("After Deleting");
            System.out.println(Arrays.toString(array_of_element));
//            for(int i = 0; i<no_of_element -1; i++){
//                System.out.println(array_of_element[i] + ",");
//            }
        }
        else{
            System.out.println("Element not found");
        }

    }
}
