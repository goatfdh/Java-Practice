package TwoDimensionalArrays;

public class printing2DArrayUsingForEachLoop {
    public static void main(String[] args) {

        // 1 2 3
        // 4 5 6
        int[][] arr = {{1,2,3},{4,5,6}};  //Array of Arrays

        for(int[] ele : arr){            //Each element is an array itself
            for(int x : ele){              //printing each value of each ele
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
