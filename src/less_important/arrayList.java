/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less_important;

import java.util.ArrayList;

/**
 *
 * @author Israt
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList  list = new ArrayList ();
       list.add(20);
       list.add("20dd");
       list.add(100);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + list.get(i));
            
        }
    }
}
