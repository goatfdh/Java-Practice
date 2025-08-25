package TwoDimensionalArrays;

import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{1,2},{3,4},{5,6}};

        int m = arr.length;
        int n = arr[0].length;

        // 1 2          //output :  1 3 5
        // 3 4             //      2 4 6
        // 5 6

// Method 1: Columnwise printing

//        for(int[] ele: arr){
//            for(int x : ele ){
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Transpose: ");
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < m ; i++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        Method 2: Storing and then printing the transpose matrix

        int[][] transpose = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        }
    }

