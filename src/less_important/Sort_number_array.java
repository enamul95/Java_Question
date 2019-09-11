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
public class Sort_number_array {

    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 8, 1, 10, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
        }
    }

}
