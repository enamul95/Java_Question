/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.Scanner;

/**
 *
 * @author Israt
 */
public class GCD_Recursive {

    //Simple Java program to find GCD (Greatest common Divisor) or GCF  (Greatest Common Factor) or HCF (Highest common factor). 
    //The GCD of two numbers is the largest positive integer that divides both the numbers fully i.e. without any remainder.
    // Simulation : enter number 20,30
    //# step1  contion not match = find(30,20%30)= find(30,20)
    //#Step 2 contiond nout match = find(20,30%20) = find(20,10)
    //#Step 3 contion not match = find(10,20%10) = find (10,0)
    //#Step 4 = contiond match  number2 = 0 so return 10
    
    
    private static int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number 1 to find GCD");
        int number1 = scanner.nextInt();

        System.out.println("Please Enter First Number 2 to find GCD");
        int number2 = scanner.nextInt();
      int gcd=  GCD_Recursive.findGCD(number1, number2);
        System.out.println("gcd = " + gcd);
    }
}
