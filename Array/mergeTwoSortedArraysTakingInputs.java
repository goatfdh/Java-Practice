package Array;

import java.util.Scanner;
public class mergeTwoSortedArraysTakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int j = 0; j < n; j++) {
            b[j] = sc.nextInt();
        }

        int[] c = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (j < n) {
            c[k++] = b[j++];
        }
        while (i < m) {
            c[k++] = a[i++];
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }


    }
}

