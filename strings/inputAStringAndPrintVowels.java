package strings;

import java.util.Scanner;

public class inputAStringAndPrintVowels {
    public static void main(String[] args) {
//        String str = "I am a girl!";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();



        int n = str.length();

        int count = 0;


        for(int i = 0 ; i<n; i++){
            int ch = str.charAt(i);
            if(ch == 'a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'|| ch == 'A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                count ++;
//                System.out.print(str.charAt(i));      //printing the vowels present in the string
            }
        }

        System.out.println("The no.of vowels in the given string is : " + count);

    }
}
