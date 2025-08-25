package TwoDimensionalArrays;

public class printingMatrixInWaveForm {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
//              Printing Row wise (alternate)
        for(int i = 0 ; i<m ; i++){
            for (int j = 0; j < n; j++) {
                if(i%2 == 0){
                    System.out.print(arr[i][j] +  " ");
                }else{
                    int a = 0;
                    int b = n-1;
                    while(a<b){
                        int temp = arr[i][a];
                        arr[i][a] = arr[i][b];
                        arr[i][b] = temp;
                        a++;
                        b--;

//                 OR this
//                    for (int k = n-1; k >=0 ; k--) {
//                        System.out.println(arr[i][j]+ " ");
//
//                    }

                        System.out.print(arr[i][j] + " ");
                    }
                }
            }

        }

    }
}
