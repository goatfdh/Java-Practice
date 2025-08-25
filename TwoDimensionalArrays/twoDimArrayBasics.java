package TwoDimensionalArrays;

import java.util.Scanner;

public class twoDimArrayBasics {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];  // 2D array declaration and memory allocation
        Scanner sc = new Scanner(System.in);
//        arr[0][0] = 10;  //initialisation
//        arr[0][1] = 20;
//        arr[0][2] = 30;
//
//        arr[1][0] = 40;
//        arr[1][1] = 50;
//        arr[1][2] = 60;

        int m = arr.length;         //Gives no. of rows
        int n = arr[0].length;     //Gives no. of columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();   //Taking input using nested loops
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");  //printing using nested loops
            }
            System.out.println();
        }
    }
}