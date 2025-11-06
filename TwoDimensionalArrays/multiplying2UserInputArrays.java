package TwoDimensionalArrays;
import java.util.Scanner;

public class multiplying2UserInputArrays {
        public static void print(int[][] res) {
            int m = res.length;
            int n = res[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

        public static void input(int[][] arr) {
            int m = arr.length;
            int n = arr[0].length;
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }

            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[][] a = new int[m][n];
            input(a);
            int[][] b = new int[n][q];
            input(b);
            int[][] c = new int[m][q];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++)
                        c[i][j] += a[i][k] * b[k][j];
                }
            }

            print(c);
        }
    }



