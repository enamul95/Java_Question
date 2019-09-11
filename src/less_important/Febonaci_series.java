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
public class Febonaci_series {

    //  1 1 2 3 5 8 (serice like 1+1 = 2, 2+3= 5)
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print( b +" ");
            int sum = a + b;
            a = b;
            b = sum;

        }
    }

}
