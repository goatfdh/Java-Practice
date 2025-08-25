package TwoDimensionalArrays;

import java.util.Scanner;

public class programToStoreRollAndMarks {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int m = sc.nextInt();
                int[][] arr = new int[m][2];


                for(int i = 0 ; i<m ;i++){
                    for(int j = 0 ; j<2 ;j++){
                        arr[i][j] = sc.nextInt();    //Roll--> i and Marks-->j
                    }
                }

                for(int i = 0 ; i<m ;i++){
                    for(int j = 0 ; j<2 ;j++){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }

                sc.close();
            }
        }
