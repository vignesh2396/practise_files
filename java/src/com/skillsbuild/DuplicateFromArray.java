import java.util.Arrays;

public class DuplicateFromArray{
    public static void main(final String args[]){
        final int[] a = {10,20,10,30,40,30,50};
        Arrays.sort(a); //sorts the elements of array in ascending order
        removeDuplicate(a);
    }
    public static void removeDuplicate(final int[] a){
        
        //to create a empty array of same length as the original array 
        final int[] temp = new int[a.length]; 
        
        int j = 0;
        for(int i=0; i<a.length - 1; i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        
        // to add the last value of the array into temp
        temp[j++] = a[a.length - 1];

        //to change the original array values same as temp 
        for(int i=0; i<j; i++){  //j = 5
            a[i] = temp[i];
        }
        
        //to print the non-duplicate values in temp array
        for(int i=0; i<j; i++){
            System.out.println(temp[i]);
        }
    }
}