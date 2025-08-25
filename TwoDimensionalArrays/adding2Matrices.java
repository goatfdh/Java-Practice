package TwoDimensionalArrays;

public class adding2Matrices {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = {{5,6},{7,8}};

        int m = arr1.length;
        int n = arr1[0].length;

        int[][] res = new int[m][n];



        // 1 2           // 5 6              //sum: 6 8
        // 3 4           // 7 8              //     10 12

//   Method 1:  Without making a new Array
//        int sum;
//
//        for (int i = 0; i < 2; i++) {
//            for(int j = 0 ;j <2 ;j++){
//                sum = arr1[i][j] + arr2[i][j];
//                System.out.print(sum +" ");
//            }
//            System.out.println();
//        }



//    Method 2: By making a new array--> res

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        }
}
