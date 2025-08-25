package Array;

import java.util.Scanner;

import static java.lang.Math.max;

public class nextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        ans[n-1] = arr[n-1];

        int nge = arr[n-1];

        for(int i = n-2 ; i>=0 ; i--) {
            ans[i] = nge;
            nge = max(arr[i], nge);
        }

        for(int ele:ans){
            System.out.print(ele + " ");
        }

        sc.close();

    }
}

