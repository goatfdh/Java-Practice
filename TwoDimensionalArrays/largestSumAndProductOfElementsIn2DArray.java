package TwoDimensionalArrays;

public class largestSumAndProductOfElementsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {5, 9}};

        int max = Integer.MIN_VALUE; //arr[0][0] can also be used
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                max = Math.max(max, arr[i][j]);
                sum += arr[i][j];
                product *= arr[i][j];
            }
        }

        System.out.println("Largest element in given 2D Array is: " + max);
        System.out.println("Sum of elements of given 2D Array is: " + sum);
        System.out.println("Product of elements of given 2D Array is: " + product);
    }
}

