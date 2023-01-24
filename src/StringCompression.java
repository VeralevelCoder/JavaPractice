import java.io.*;
import java.util.Scanner;

public class  StringCompression {
    public static String compress(String s) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
    public static void  main (String args []) {
        Scanner sc =  new  Scanner (System.in);
        String s = new String();
        s = sc.next();

        int n = s.length();
        String ans = compress(s);
        System.out.print(ans);
    }
}