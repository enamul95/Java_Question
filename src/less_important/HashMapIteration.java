/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Israt
 */
public class HashMapIteration {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Enamul");
        map.put(25, "Haque");
        map.put(12, "Mohsin");
        System.out.println("map = " + map.size());
        System.out.println("Looping ");

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println("Key = " + m.getKey() + "  Value ="+m.getValue() );

        }
    }
}
