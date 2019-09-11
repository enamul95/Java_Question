/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Israt
 */
import static com.test.LongestPalinSubstring.getLongestPalindrome;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        // このコードは標準入力と標準出力を用いたサンプルコードです。
        // このコードは好きなように編集・削除してもらって構いません。
        // ---
        // This is a sample code to use stdin and stdout.
        // Edit and remove this code as you like.

        /* Scanner scanner = new Scanner(System.in);
    Sting s = scanner.nextLine();
    System.out.println("Hello {"+s+"}");
         */
        String[] lines = getStdin();

        for (int i = 0, l = lines.length; i < l; i++) {
           
            if (lines[i].length() >= 1 && lines[i].length() <= 20) {
                String inputString = lines[i];
                Pattern pattern = Pattern.compile("^[0-9]\\d*$");
                Matcher matcher = pattern.matcher(inputString);
                
                if (matcher.find() && inputString.length() <= 1000000) {
                    String longestPalindrome = getLongestPalindrome(inputString);
                    System.out.println("longestPalindrome = " + longestPalindrome);
                }
            }
        }

    }

    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("scanner = " + scanner);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            System.out.println("lines = " + lines);
            String inputString=scanner.nextLine();
            lines.add(inputString);
             if (inputString.length() >= 1 && inputString.length() <= 20) {
                //String inputString = lines[i];
                Pattern pattern = Pattern.compile("^[0-9]\\d*$");
                Matcher matcher = pattern.matcher(inputString);
                
                if (matcher.find() && inputString.length() <= 1000000) {
                    String longestPalindrome = getLongestPalindrome(inputString);
                    System.out.println("longestPalindrome = " + longestPalindrome);
                }
            }
        }
        return lines.toArray(new String[lines.size()]);
    }

    private static String getLongestPalindrome(String inputString) {
        int maxLength = 1;

        int start = 0;
        int length = inputString.length();
        int low, high;
        for (int i = 1; i < length; ++i) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < length && inputString.charAt(low) == inputString.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < length && inputString.charAt(low) == inputString.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        return inputString.substring(start, start + maxLength);
    }

}
