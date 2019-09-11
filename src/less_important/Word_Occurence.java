/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

/**
 *
 * @author enamul
 */
public class Word_Occurence {
    public static void main(String[] args) {
        String s = "accaada";
        
        int  lenght = s.length();
        int count= 0;
        for (int i = 0; i < lenght; i++) {
          //  System.out.println(" "+s.charAt(i));
            if(s.charAt(i)== 'a'){
                count++;
            }        
           
            
        }
         System.out.println(" a is ="+count);
    }
    
}
