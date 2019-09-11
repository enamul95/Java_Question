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
public class Stack {

    //https://www.youtube.com/watch?v=fptlqsesjxY&t=261s
    //last in first out (LIFO)
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if (size() == 5) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data = 0;
        // top -- when it added value to top++ to it index incremented
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int size() {
        return top;
    }

    public int peek() {
        // not delete the element
        int data = 0;
        data = stack[top - 1];
        return data;
    }

    public void show() {
        for (int data : stack) {
            System.out.print(" " + data);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(20);
        stack.push(20);
        
        System.out.println(stack.pop());

        stack.show();
    }
}
