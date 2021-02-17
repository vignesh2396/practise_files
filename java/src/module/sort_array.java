package module;

import java.util.Arrays; // array class imported

public class sort_array {
    public static void main(String[] args) {

        // array creation
        int[] num_array = {2145, 5143, 5146, 1476, 9756};
        String[] str_array = {"Java", "C", "C++", "Python", "Php"};

        // before sorting
        System.out.println("---- Before sorting ----");
        System.out.println("Numeric array : " + Arrays.toString(num_array));
        System.out.println("String array : " + Arrays.toString(str_array));

        // Sorting
        Arrays.sort(num_array);
        Arrays.sort(str_array);

        // after sorting
        System.out.println("\n ---- After sorting ----");
        System.out.println("Numeric array : " + Arrays.toString(num_array));
        System.out.println("String array : " + Arrays.toString(str_array));
    }
}
