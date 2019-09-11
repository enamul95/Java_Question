/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.Scanner;

/**
 *
 * @author enamul
 */
public class Palindrom_string {
    // aba  palindrome is compare value==> first letter to last leter 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalText = scanner.nextLine();
        int lenght = originalText.length();
        String reverseString = "";
        boolean b = true;
        // radar Is Palindrom
        char c[] = originalText.toCharArray();
        for (int i = 0; i < lenght / 2; i++) {
            if (c[i] != c[lenght - 1 - i]) {
                //condition copare not match any first character & last character  or second to last second
                b = false;
                break;
            }
        }
        if(b){
            System.out.println(originalText+"= is palimdrome.");
        }else{
         System.out.println(originalText+"= is Not palimdrome.");
        }

        /*  for (int i = lenght-1; i >= 0; i--) {
          reverseString= reverseString+originalText.charAt(i);
        }
        
        if(originalText.equals(reverseString)){
            System.out.println(originalText+" Is Palindrom");
        }else{
            System.out.println(originalText+" Is Not Palindrom");
        }
         */
    }
}
