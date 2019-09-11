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
public class MaxValue_from_array {

    public static void main(String[] args) {
        int arr[] = {20, 30,70,50, 60};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {            
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }

}
