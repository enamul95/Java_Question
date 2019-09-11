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
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "This is   Enamul Haque";
        str = str.replaceAll("\\s", "");
        System.out.println("str = " + str);
    }
}
