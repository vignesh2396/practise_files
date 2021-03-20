package module;
import java.util.Arrays;
import java.util.Scanner;
public class activity7 {
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        n = input.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.print("Enter the first matrix values : ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the second matrix values : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k< n; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Encoded matrix : " + Arrays.deepToString(c));
    }
}
