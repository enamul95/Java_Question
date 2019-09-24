/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Israt
 */
public class Number_of_Word {

    public static void main(String[] args) {
        String s = "This is my best work which is given my reward.";
        String token[] = s.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < token.length-1; i++) {
           // System.out.println("i = " + token[i]);
            if (map.containsKey(token[i])) {
                int count = map.get(token[i]);
                map.put(token[i], count++);
            } else {
                map.put(token[i], 1);
            }
        }
        System.out.println("map = " + map);

    }
}
