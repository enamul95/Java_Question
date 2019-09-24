/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

/**
 *
 * @author Israt
 */
public class Armstrong_Number {

    public static void main(String[] args) {
        /*
        First of all we need to understand what Armstrong Number is. Armstrong number is the number
        which is the sum of the cubes of all its unit, tens and hundred digits for three digit number.

         153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
         */

        int c = 0, a, temp;
        int num = 153;

        temp = num;
        while (num > 0) {
            a = num % 10;
            System.out.println("a = " + a);
            num = num / 10;
            System.out.println("num = " + num);
            System.out.println("c = " + c);
            c = c + (a * a * a);
            System.out.println("c after= " + c);
            System.out.println();
        }

        if (temp == c) {
            System.out.println(temp + " Is Amstrong");
        } else {
            System.out.println(temp + " Is Not Amstrong");
        }
    }
}
