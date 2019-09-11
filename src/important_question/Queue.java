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
public class Queue {

    // Fist in first out(FIFO)
    //https://www.youtube.com/watch?v=8K1rt6v5mJ4&t=133s

    int quque[] = new int[5];
    int front;
    int rear;
    int size;

    public void enqueue(int data) {
        quque[rear] = data;
        // front is zero, first time front & rear is zero. if we insert value via rear rear must be increase
        rear++;
        size++;
        // Size here to lop here 
        
    }
    
    public void show(){
        System.out.print("Items : ");
        for (int i = 0; i < size; i++) {
            //front+i because value shift when you dequeue
         System.out.print(quque[front+i]+" ");
        }
    }
    
    public void deque(){
     //int data = quque[front];
     front++;
     size--;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
         queue.enqueue(30);
        
        queue.deque();        
        
        queue.show();

    }
}
