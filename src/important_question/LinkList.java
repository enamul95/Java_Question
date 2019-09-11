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
public class LinkList {

    Node head;

    class Node {

        int data;
        Node next;
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;// if it is first node it is null
        //Check head is first 
        if (head == null) {
            //if node is first node it is null so head is itself node
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println("data = " + n.data);
            n = n.next;
        }
        System.out.println("data = " + n.data);
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insert(5);
        linkList.insert(10);
        linkList.insert(20);

        linkList.show();
    }
}
