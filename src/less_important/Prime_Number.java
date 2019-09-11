/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

/**
 *
 * @author Enamul
 */
public class Prime_Number {
   //https://www.programiz.com/java-programming/examples/prime-number
    
    public static boolean isPring(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            // condition for  number is not priem
            if (number % i  == 0) {
                isPrime = false;
                break;
            }

        }

        return isPrime;
    }
    
    /*
    n the above program, for loop is used to determine if the given number num is prime or not. 
    We only have to loop through 2 to half of num, because no number is divisible by more than its half.
    */

    public static void main(String[] args) {
        int number = 5;
        boolean b = isPring(number);
        if (b) {
            System.out.println(number + " Is Prime Number");
        } else {
            System.out.println(number + " Is Not Prime Number");
        }
    }

}
