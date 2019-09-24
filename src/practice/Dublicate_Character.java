/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Israt
 */
public class Dublicate_Character {
    public static void main(String[] args) {
        String s= "abccb";
        char [] c = s.toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = i+1; j < c.length; j++) {
               if(c[i]==c[j]){
                   System.out.println(c[i]+ " is Duplicte Number");
                   break;
               }
            }
        }
    }
}
