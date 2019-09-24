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
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number to find squre root");
        double number = scanner.nextDouble();
        
       double squreRoot = Math.sqrt(number);
       
        System.out.println("squreRoot = " + squreRoot);
    }
}
