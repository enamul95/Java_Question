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
public class Second_hightest_value {

    public static void main(String[] args) {
        int arr[] = {20, 30, 50, 30, 60};
        int secondLargest = arr[0];
        int largest = arr[0];


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }

        System.out.println("secondLargest = " + secondLargest);
    }

}
