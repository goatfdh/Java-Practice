package Array;

public class sortZeroesOnesAndTwos {
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 1,0,2,0,1,2,0,1};
//        int n = arr.length;

//        2 pass solution
//        int noOfZeroes = 0;
//        int noOfOnes = 0;
//        int noOfTwos = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) noOfZeroes++;
//            if (arr[i] == 1) noOfOnes++;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (i < noOfZeroes) {
//                arr[i] = 0;
//            } else if (i< noOfZeroes +noOfOnes) {
//                arr[i] = 1;
//            }
//            else{
//                arr[i] = 2;
//            }
//        }
//  3 pointer approach / Dutch Flag Algorithm / One Pass Algorithm

//        int low = 0;
//        int mid = 0;
//        int high = n-1;
//
//        while(mid<=high){
//                if(arr[mid] == 0){
//                    int temp = arr[mid];
//                    arr[mid] = arr[low];
//                    arr[low] = temp;
//                    low++;
//                    mid++;
//                }
//
//                else if(arr[mid]==1){
//                    mid++;
//                }
//
//                else if(arr[mid]==2){
//                    int temp = arr[mid];
//                    arr[mid] = arr[high];
//                    arr[high] = temp;
//                    high--;
//                }
//            }
//        for(int ele:arr){
//            System.out.print(ele + " ");
//        }

//    reading inputs from a single line / sorting 0's and 1's
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in).useDelimiter("[,\\s+]");
//            int n = sc.nextInt();
//            int[] arr = new int[n+1];
//
//            for(int i=0; i<=n ;i++){
//                arr[i] = sc.nextInt();
//            }
//
//            int i=0;
//            int j=n;
//
//            while(i<=j){
//                if(arr[i]==0){
//                    i++;
//                } else if(arr[i]==1){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    j--;
//                }
//            }
//
//            for(int ele:arr){
//                System.out.print(ele+ " ");
//            }
//        }
//
//    }
}

