/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Israt
 */
public class Test {
    private int start =0;
    private int maxLen = 1;
    public  String logetPalindrone(String s){
    int len  = s.length();
    if(len<=1) return s;
        for (int i = 0; i < len; i++) {
            helper(s,i-1,i+1);
            helper(s,i,i+1);
            
        }
        
        return s.substring(start, start+maxLen);
    }
    
    public void helper(String s,int head,int tail){
        while (head>=0 && tail<s.length() && s.charAt(head)==s.charAt(tail)) {
            int len = tail-head+1;
            if(len>maxLen){
                maxLen =len;
                start = head;
            }
            head--;
            tail++;
            
        }
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        String s = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
        String logetPalindrone = t.logetPalindrone(s);
        System.out.println("logetPalindrone = " + logetPalindrone);
                
    }
}
