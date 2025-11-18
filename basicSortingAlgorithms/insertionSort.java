package basicSortingAlgorithms;

import java.util.Scanner;

public class insertionSort {
    public static void print(int[] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        print(arr);

        for (int i = 1; i < n; i++) {
            for(int j = i; j>=1 ; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
        print(arr);
    }
}
