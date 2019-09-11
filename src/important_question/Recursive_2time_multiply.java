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
public class Recursive_2time_multiply {
    // #step 1 =result(5) = 2*result(n-1) =2* result(4)
    // #step 2 =result(4) = 2*result(4-1) =2*2*result(3)
    // #step 3 =result(3) = 2*result(3-1) =2*2*2*result(2)
    // #step 4 =result(2) = 2*result(2-1) =2*2*2*2*result(1)
    // #step 1  = condition match return 2= 2*2*2*2*2=32
    //Output is = 32
   

    public static int result(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 * result(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("result = " + result(5));
    }

}
