/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Israt
 */
public class Reverse_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
      char c[] = inputText.toCharArray();
      String reverse = "";
        for (int i =c.length-1;i>=0; i--) {
            System.out.println("i = " + c[i]);
            reverse +=c[i];
            
        }
        System.out.println("reverse = " + reverse);
    }
}
