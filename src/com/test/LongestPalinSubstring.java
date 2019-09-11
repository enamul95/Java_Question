/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Israt
 */
public class LongestPalinSubstring {

    // A utility function to print a substring str[low..high] 
   /* static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }
    */
//271828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992181741359662904357290033429526059563073813232862794349076323382988075319525101901157383418793070215408914993488416750924476146066808226480016847741185374234544243710753907774499206
    // This function prints the longest palindrome substring  
    // (LPS) of str[]. It also returns the length of the   
    // longest palindrome  
    static String getLongestPalindrome(String inputString) {
        int maxLength = 1; // The result (length of LPS) 

        int start = 0;
        long length = inputString.length();
        System.out.println("length = " + length);

        int low, high;

        // One by one consider every character as center 
        // point of even and length palindromes 
        for (int i = 1; i < length; ++i) {
            // Find the longest even length palindrome with  
            // center points as i-1 and i. 
            low = i - 1;
            high = i;
            while (low >= 0 && high < length
                    && inputString.charAt(low) == inputString.charAt(high)) {
               // System.out.println("i = " + i);
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            // Find the longest odd length palindrome with  
            // center point as i 
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < length
                    && inputString.charAt(low) == inputString.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }

       // System.out.print("Longest palindrome substring is: ");
       // printSubStr(inputString, start, start + maxLength - 1);
        
         System.out.println("maxLength = " + maxLength);

        return inputString.substring(start, start + maxLength);
    }
    
  /*  static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

    
    
    public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
    */
    
    public static String longestPalindrome1(String s) {
    if(s==null || s.length()<=1)
        return s;
 
    int len = s.length();     
    int maxLen = 1;
    boolean [][] dp = new boolean[len][len];
 
    String longest = null;
    for(int l=0; l<s.length(); l++){
        for(int i=0; i<len-l; i++){
            int j = i+l;
            if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                dp[i][j]=true;
 
                if(j-i+1>maxLen){
                   maxLen = j-i+1; 
                   longest = s.substring(i, j+1);
                }
            }
        }
    }
 
    return longest;
}

    
     public static String longestPalindromicSubString(String s) {

     if (s.length() == 0) return "";

     int start = 0;
     int end = 0;


     for (int i = 0; i < s.length(); i++) {

         int len1 = helper(s, i, i);

         int len2 = helper(s, i, i + 1);

         int final_len = Math.max(len1, len2);

         if (final_len > end - start) {

             start = i - (final_len - 1) / 2;
             end = i + final_len / 2;
         }
     }

     return s.substring(start, end + 1);
 }

 public static int helper(String s, int left, int right) {
     int l = left;
     int r = right;

     while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
         l--;
         r++;
     }

     return r - l - 1;
 }
    // Driver program to test above function 
    public static void main(String[] args) {
             //012343210
     
       String str = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
     
       str = "242";
        Pattern pattern = Pattern.compile("^[0-9]\\d*$");
        Matcher matcher = pattern.matcher(str);
       
        if (matcher.find() && str.length() <= 1000000) {
           String longestPalindrome = getLongestPalindrome(str);
         //  String longestPalindrome = longestPalindrome(str);
           // String longestPalindrome = longestPalindromeString(str);
            System.out.println("longestPalindrome = " + longestPalindrome);
        } /*else {
            System.out.println("Invalid input Please input [0-9] ");
        }
        */
    }

} 
// This code is contributed by Sumit Ghosh 
