package DSA;

import java.util.Scanner;

public class mergeTwoSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 3, 4, 7};
        int[] b = {22, 25, 26, 33};
        int[] c = new int[a.length + b.length];

//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < a.length || j < b.length) {
//            if (a[i] < b[j]) {
//                c[k] = a[i];
//                i++;
//                k++;
//            } else if(a[i] > b[j]) {
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//
//             if (i == a.length) {
//                while (j < b.length) {
//                    c[k] = b[j];  // take only the elements of b array
//                    k++;
//                    j++;
//                }
//
//                if(j == b.length){
//                    while (i < a.length) {
//                        c[k] = a[i]; // take only the elements of a array
//                        k++;
//                        j++;
//                    }
//                }
//
//            }
//        }
//

//        method 2 --> put the pointers i,j,k at last index and fill the array in decreasing order







        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}

