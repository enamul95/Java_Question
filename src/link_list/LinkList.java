/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author enamul
 */
public class LinkList {

    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head == null) {
            //first node is null so node itself is head
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                //Jumping between nodes
                n = n.next;
            }
            //Add created node here
            n.next = node;

        }
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            //Jumping between nodes
            n = n.next;
        }
        //Last Node print
        System.out.println(n.data);

    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(5);
        list.add(20);
        list.add(50);
        
        list.show();
    }
}
