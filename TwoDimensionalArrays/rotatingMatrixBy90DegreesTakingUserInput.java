package TwoDimensionalArrays;

import java.util.Scanner;

public class rotatingMatrixBy90DegreesTakingUserInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();

            int[][] arr = new int[m][m];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                  arr[i][j] = sc.nextInt();
                }
            }
//       Transposing first

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

//        Rotating by 90 degrees

            for (int i = 0; i < m; i++) {
                int a = 0;
                int b = m-1;

                while(a<b){
//                swap each row columnwise
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;
                    a++;
                    b--;
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }


