/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important_question;

/**
 *
 * @author Enamul
 */
public class BinarySearch {
    //Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.

//In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method.
    public static int binarySearch(int arr[], int number) {
        int first = 0;
        int last = arr.length - 1;
        System.out.println("last = " + last);
        int middle = (first + last) / 2;
        System.out.println("middle = " + middle);

        while (last >= first) {
            if (arr[middle] == number) {
                return number;
            } else if (arr[middle] < number) {
                first = middle + 1;

                System.out.println("first = " + first);
            } else if (arr[middle] > number) {
                last = middle - 1;

            }

            middle = (first + last) / 2;

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int number = 20;
        int index = binarySearch(arr, number);
        if (index == -1) {
            System.out.println(number + " is not found");
        } else {
            System.out.println(number + " is not found in index no ");
        }
    }

}
