package slidingWindows;

public class maxSumkSizedSubArrays {
    public static void main(String[] args) {

        //method 1 --> Brute force
        //T.C = O(n*k) ~ O(n^2) if k is like n
//        int[] arr = {10,20,1,3,-40,80,10};
//        int k = 3;
//        int maxSum = 0;
//        int n = arr.length;
//        for (int i = 0; i < n-k+1; i++) {
//            int sum = 0;
//            for (int j = i; j <= i+k-1; j++) {
//                sum += arr[j];
//            }
//            maxSum = Math.max(maxSum,sum);
//
//        }
//        System.out.println(maxSum);


        //method-2 --> Sliding Windows
        int[] arr = {10,20,1,3,-40,80,10};
        int n = arr.length;
        int k = 3;
        int i = 0;
        int j = k-1; int sum = 0;
        int maxSum = 0;

        for(int a = i ;a<=k-1;a++) {   //k times
            sum += arr[a];
        }
        i++; j++;

        while(j<n){  //n-k times
           sum = sum - arr[i-1] + arr[j];
           maxSum = Math.max(maxSum,sum);
           i++; j++;
        }

        System.out.println(maxSum);

        //TC = O(n)


    }

}
