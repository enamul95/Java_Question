/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Israt
 */
public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = new String("Saekkeeett");
      
        Map<String,Integer> map = new HashMap<>();
        char [] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
              int count = 1;
            for (int j = i+1; j < str.length(); j++) {
               if(chars[i]==chars[j]){
                   //System.out.println(chars[j]);
                   count++;
               }
                
            }
           
           
            
        }
        System.out.println("map = " + map);
    }

}
