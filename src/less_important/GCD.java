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
public class GCD {
   //The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder).    
    public static void main(String[] args) {
         int num1 = 81,num2=153,gcd = 1;
        for (int i = 1; i <=num1 && i<= num2; ++i) {
            if(num1%i==0 & num2%i==0){
             gcd = i;
            }
          
        }
        System.out.println(" GCD of 81 and 153 is = " + gcd);
    }
    
}
