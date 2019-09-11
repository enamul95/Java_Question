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
public class Sort_String {

    public static void main(String[] args) {
        String str = "gbca";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                
                if (c[i] < c[j]) {
                    char temp = c[i];
                    System.out.println("temp = " + temp);
                    c[i] = c[j];
                    c[j] = temp;
                }
               

            }

        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);

        }

    }
}
