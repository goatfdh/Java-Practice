package Recursion;

import java.util.*;

public class powerLogarithmic {
    public static int power(int a ,int b){
        if(b==0) return 1;
        int ans = power(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(a+ " Power " +b + ": " + power(a,b));

    }
}
