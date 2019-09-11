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
public class Dublicate_array_items_remove {

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];
        // Changing original array  
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5, 6, 7, 8, 8, 9};
        int length = arr.length;  
        
        length = removeDuplicateElements(arr, length);  
        System.out.println("length = " + length);
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    

    }
}
