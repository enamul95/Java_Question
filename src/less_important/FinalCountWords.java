/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Israt
 */
public class FinalCountWords {

    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        Map<String, Integer> map = new HashMap<String, Integer>();
        String split[] = str.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }else{
                map.put(split[i], 1);
            }
        }
        System.out.println("Valus ="+map);

    }

}
