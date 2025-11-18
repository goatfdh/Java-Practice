package basicSortingAlgorithms;

import java.util.Scanner;

public class kthMaxElementAtRightSelectionSort {
    //have to arrange in only increasing order, but in each pass put the max element at the right
    public static void print(int[] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i ,int j) {
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

        for (int i = 0; i < n-1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for (int j = 0; j <= n-1-i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            swap(arr,n-1-i,maxdx);

        }

        print(arr);
        }

    }






