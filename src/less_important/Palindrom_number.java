/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

/**
 *
 * @author enamul
 */
public class Palindrom_number {
    //A palindrome number is a number that is same after reverse

    public static void main(String args[]) {
        int remainder, sum = 0, temp;
        int n = 454;//It is the number variable to be checked for palindrome  
        
        temp = n;
        while (n > 0) {
            remainder = n % 10;  //getting remainder  
            sum = (sum * 10) + remainder;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }
}
