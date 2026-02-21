package prefixSum;

public class runningSumOf1DArray {
    public static void main(String[] args) {
        //Prefix sum array --> current element + sum of all previous elements
        int[] arr = {10,2,3,6,-8,9};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");    //this will return a prefix sum array
                                             // TC = O(n) SC = O(1) as we are modifying the arr and not creating a new one
        }
    }
}
