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
public class Dublicate_array_items {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2,5, 6, 7, 8, 8, 9};
        for (int i = 0; i < arr.length; i++) {            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

}
