/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_chalenges;

/**
 *
 * @author enamul
 */
public class Array_Rotation {

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};

        System.out.println("fff");
 
        int count = 3;
        while (count > 0) {
            
            int len = A.length;
            int temp = A[len - 1];
            System.out.println("temp = " + temp);
            for (int i = len - 1; i >= 1; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
            count--;

        }
        
       
          for (int i = 0; i < A.length; i++) {
              System.out.print(" " + A[i]);
        }
    }
}
