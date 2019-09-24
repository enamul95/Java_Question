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
            //getting remainder  if we do  % (modulus) any number with 10 it gives remainder
            //if we do  % (modulus) any smaller number  with 10 it gives output smaller number like 5%10 =5
            remainder = n % 10;  
            System.out.println("remainder = " + remainder);
            sum = (sum * 10) + remainder;
            n = n / 10; 
            System.out.println("n = " + n);
            System.out.println();
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }
}
