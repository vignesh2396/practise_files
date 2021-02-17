import java.util.Arrays;

public class CheckTwoArraysAreEqual {

 public static void main(final String[] args) {

  final int[] array1 = { 1, 2, 3, 4, 5 };
  final int[] array2 = { 1, 2, 3, 4, 5 };

  final boolean intCheck = Arrays.equals(array1, array2);
  System.out.println("Two Integers are Equal :: " + intCheck);
 }
}