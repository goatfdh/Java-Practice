package Recursion;

import java.util.*;

public class sumReturnType {
    public static int add(int n){
        if(n==0 || n==1) return n;
        return n + add(n-1);    //using recurrence Relation
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(add(n));
    }
}
