package Recursion;

import java.util.*;

public class parameterisedSum {

    public static void add(int n, int s) {
        if (n == 0) {
            System.out.println("Sum: " + s);
            return;
        }
        add(n - 1, s + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = sc.nextInt();
        add(n,0);
    }
}
