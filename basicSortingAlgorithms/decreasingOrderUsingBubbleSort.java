package basicSortingAlgorithms;

import java.util.Scanner;

public class decreasingOrderUsingBubbleSort {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
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

        for (int x = 0; x< n-1; x++) {
            boolean flag = true;    //sorted
            for (int j = 0; j<n-1-x ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;

        }

        print(arr);
    }
}
