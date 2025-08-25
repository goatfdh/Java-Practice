package strings;

import java.util.Scanner;

public class stringsBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        char[] arr = {'S','o','u','m','y','a'} ;  //also a way to declare a string or character array

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }


//        String str = sc.next();   //only reads a word before the first space
//        System.out.println(str);

//        String whole = sc.nextLine();  //reads the whole string including spaces
//        System.out.println(whole);

    }
}
