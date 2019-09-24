/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Israt
 */
public class Second_Largest {
    public static void main(String[] args) {
        int [] arr = {45,30,40,31,400,300};
        int largest = arr[0];
        int second_largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]>largest){
              second_largest = largest;
              largest = arr[i];
          }else{
              second_largest = arr[i];
          }
        }
        System.out.println("second_largest = " + second_largest);
    }
}
