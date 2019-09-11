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
public class ReverseNumber {
    public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      num = in.nextInt();
       System.out.println("num = " + num);
      //While Loop: Logic to find out the reverse number
      while( num != 0 )
      {
          System.out.println("num ****= "  + num);
          reversenum = reversenum * 10;
          System.out.println("reversenum = " + reversenum);
         // System.out.println(reversenum+num);
          reversenum = reversenum + num%10;
          System.out.println("reversenum = " + reversenum);
          num = num/10;
          System.out.println("num = " + num);
          
          System.out.println();
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}
