package TwoDimensionalArrays;

public class multiplicationOfMatrices {

    public static void print(int[][] res){
        int m = res.length;
        int n = res[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[][] a = {{1,2,2},{1,3,4}};
        int[][] b = {{1,2,3},{7,1,0},{1,2,1}};

        int[][] c = new int[a.length][b[0].length];

        for(int i = 0 ;i< c.length;i++){
            for(int j = 0 ; j < c[0].length; j++){
                for( int k = 0 ;k<b.length;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        print(a);
        print(b);
        print(c);

    }
}
