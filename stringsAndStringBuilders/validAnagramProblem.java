package stringsAndStringBuilders;

import java.util.*;

public class validAnagramProblem {
        public static boolean isAnagram(String s, String t){
            if(s.length() != t.length()) return false;

            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            boolean result = isAnagram(s,t);
            System.out.println(result);
        }
    }

