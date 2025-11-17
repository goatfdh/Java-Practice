package basicSortingAlgorithms;

import java.util.Scanner;

public class bubbleSort {
    public static void print(int[] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr);

        for(int x = 0; x < n-1; x++){
            boolean flag = true;
            for(int i = 0 ; i<n-1-x ; i++){ //no.of passes
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }

        print(arr);
    }
}
