/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;


import java.util.Arrays;

/**
 *
 * @author enamul
 */
public class Anagram {
    //Two strings are called anagrams if they contain same set of characters but in different order

    public void isAnagram(String str1, String str2) {
        //  \\s - matches single whitespace character 
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        // System.out.println("dd "+s1);
        
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
           
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1, arr2);
            if (status) {
                System.out.println(s1 + " and " + s2 + " are anagrams");
            } else {
                System.out.println(s1 + " and " + s2 + " are Not anagrams");
            }

        }

    }

    public static void main(String[] args) {

        Anagram a = new Anagram();      
        a.isAnagram("Keep", "Peek");
        a.isAnagram("Mother In Law", "Hitler Woman");
         a.isAnagram("a", "d");

    }

}
