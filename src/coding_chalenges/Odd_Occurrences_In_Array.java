/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_chalenges;

import java.util.Arrays;

/**
 *
 * @author enamulhaque
 */
public class Odd_Occurrences_In_Array {
    public int solution(int[] A) {
        
        Arrays.sort(A);      
      
        int i, j, count = 0;
        for (i = 0; i < A.length; i++) {
            System.out.println("i = " + i);            
            for (j = i + 1; j < A.length; j++) {
                System.out.println("j = " + j);
                if (A[i] == A[j]) {
                    count++;
                    
                } else {
                    
                    break;
                }
            }
            
            if (count % 2 == 0) {               
                return A[i];
            } else {
               
                count = 0;
                i = j - 1;
                
               
            }
           
        }
        return 0;
        
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {9, 3, 9, 3, 9, 7, 9};
        Odd_Occurrences_In_Array test = new Odd_Occurrences_In_Array();
        int rValue = test.solution(A);
        System.out.println(rValue);
    }
}
