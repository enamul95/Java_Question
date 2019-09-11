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
public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = new String("Sakkett");
        int count = 0;
        char [] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
               if(chars[i]==chars[j]){
                   System.out.println(chars[j]);
                   count++;
               }
                
            }
            
        }
    }

}
