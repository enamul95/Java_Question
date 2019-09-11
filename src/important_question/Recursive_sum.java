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
public class Recursive_sum {
    
    // Step #1 sum(5) = num + sum(num - 1)= 5+sum(5-1) = 5+sum(4)=5+sum(4)
    // Step #2 sum(4) = num + sum(num - 1)= 4+sum(4-1) = 4+sum(3)=5+4+sum(3)
    // Step #1 sum(3) = num + sum(num - 1)= 3+sum(3-1) = 3+sum(2)=5+4+3+sum(2)
    // Step #1 sum(2) = num + sum(num - 1)= 2+sum(2-1) = 2+sum(1)=5+4+3+2+sum(1)
    // Step #1 sum(1) = condition match so return =1 = 5+4+3+2+1 = 15
    // Output is + 15

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(" Sum =" + sum(5));
    }

}
