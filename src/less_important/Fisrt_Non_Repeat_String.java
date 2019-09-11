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
public class Fisrt_Non_Repeat_String {

    public static void main(String[] args) {
        String s = "ffeedddbbaaclck";
        for (char c : s.toCharArray()) {          
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("First Non Repeat Character Is  = " + c);
            }
        }
    }

}
