/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_chalenges;

/**
 *
 * @author enamulhaque
 */
public class Binary_gap {
    //Binary Gap 1001 number has 2 binary gap. 00 is binary gap
    //1000010001 here is two binary gap one 0000 whihc lenght is another is 000 which is 3 & logest binary gap is 4
    // 1111 has no binary gap
    //10100 has binary gap 1. last digit if zero not count
    //Check form right look for 1 . Every one is beginer and end with gap
    public int solution(int N) {
        int ptr; //Used for bitwise operation.
        for (ptr = 1; ptr > 0; ptr <<= 1) //Find the lowest bit 1
        {
            if ((N & ptr) != 0) {
                break;
            }
        }
        int cnt = 0; //Count the (possible) gap
        int ret = 0; //Keep the longest gap.
        for (; ptr > 0; ptr <<= 1) {
            if ((N & ptr) != 0) { //If it's bit 1
                ret = cnt < ret ? ret : cnt; //Get the bigger one between cnt and ret
                cnt = -1; //Exclude this bit
            }
            cnt++; //Increment the count. If this bit is 1, then cnt would become 0 beause we set the cnt as -1 instead of 0.
        }
        return ret;
    }
    
    public static void main(String[] args) {
        Binary_gap binary_gap = new Binary_gap();
        int solution = binary_gap.solution(1001);
        System.out.println("solution = " + solution);
    }
}
