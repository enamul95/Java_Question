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
public class Cycle_Rotation_Array {
    //Array rotation means rotate array from right or left that means arr[1,2,3] on rotate it will shift like arr[3,1,2]
    //K time rotate may be two or 3 or even more
    //right rotate means last array value will be first array values

    public int[] solution(int[] A, int k) {
        while (k > 0) {
            int len = A.length;
            int temp = A[len - 1];
            System.out.println("temp = " + temp);
            for (int i = len - 1; i >= 1; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
            k--;
        }

        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int k = 1;
        //

        Cycle_Rotation_Array cycle_Rotation_Array = new Cycle_Rotation_Array();
        int[] solution = cycle_Rotation_Array.solution(A, k);

        for (int i = 0; i < solution.length; i++) {
            System.out.print(" " + solution[i]);
        }
    }

}
