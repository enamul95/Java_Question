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
public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter reverse String" );
        String str = scanner.nextLine();
        String token[] = str.split("");
        for (int i = token.length-1; i>=0; i--) {
            System.out.print(token[i]+"");
        }
        System.out.println();
        
        
    }
    
}
