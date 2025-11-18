package basicSortingAlgorithms;

import java.util.Scanner;

public class selectionSort {
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

        for (int x = 0; x < n-1; x++) {  //no.of passes
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int i = x; i < n; i++) {
                if(arr[i]<min){
                    min = arr[i];
                    mindx = i;
                }
            }
            swap(arr,x,mindx);
        }

        print(arr);
        
    }
}
