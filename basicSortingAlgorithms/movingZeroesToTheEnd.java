package basicSortingAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class movingZeroesToTheEnd {
    public static void print(int[] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {5,4,0,-2,0,1,0,0};

            print(arr);
            int n = arr.length;

            int noz = 0;

            for (int i = 0; i < n; i++) {
                if(arr[i] == 0) noz++;
            }

            for (int x = 0; x < noz; x++) {
                for (int i = 0; i < n-1-x; i++) {
                    if(arr[i] == 0){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }

            print(arr);

        }
}

