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
public class MissingNumber_Array {

    public static void main(String[] args) {

        // given input
        int[] input = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};

        // let's create another array with same length
        // by default all index will contain zero
        // default value for int variable
        int[] register = new int[input.length];

        // now let's iterate over given array to
        // mark all present numbers in our register
        // array
        for (int i : input) {
            
            register[i] = 1;
           
        }

        // now, let's print all the absentees
        System.out.println("missing numbers in given array");

        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }

}
