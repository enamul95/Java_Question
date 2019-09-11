/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important_question;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Enamul
 */
public class LRU {

    public static void main(String[] args) {
        LRU l = new LRU(5);
        l.set(1, "A");
        l.set(2, "B");
        l.set(3, "C");
        l.set(3, "C");
        l.printContents();

    }

    // region Member Variables
    private int capacity;
    private Map<Integer, Node> data;
    private Node head;
    private Node tail;

    // endregion
    // region Constructors
    public LRU(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>();
    }
    // endregion

    public String get(int key) {

        // Existing key
        if (data.containsKey(key)) {

            // Move to first
            Node node = data.get(key);
            moveFirst(node);

            return node.value;
        }

        // Not found
        return null;
    }

    public void set(int key, String value) {
        // Existing slot
        if (data.containsKey(key)) {
            Node node = data.get(key);
            node.value = value;
            moveFirst(node);
            return;
        }

        // Out of capacity, cleaning the oldest slot
        if (data.size() >= capacity) {
            int id = tail.key;
            removeLast();
            data.remove(id);
        }

        // New slot
        Node node = new Node(key, value);
        add(node);
        data.put(key, node);
    }

    private void add(Node node) {
        // Reset position
        node.prev = null;
        node.next = null;

        // First element
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        // Existing element
        head.prev = node;
        node.next = head;
        head = node;

    }

    private void remove(Node node) {
        // Nothing to do
        if (node == null || head == null) {
            return;
        }

        // The only one item
        if (head == tail && node == head) {
            head = null;
            tail = null;
            return;
        }

        // Remove from head
        if (node == head) {
            head.next.prev = null;
            head = head.next;
            return;
        }

        // Remove from end
        if (node == tail) {
            tail.prev.next = null;
            tail = tail.prev;
            return;
        }

        // Remove in the middle
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    // move a node to the head (for a cache hit)
    private void moveFirst(Node node) {
        remove(node);
        add(node);
    }

    // remove the oldest item which is the tail
    private void removeLast() {
        remove(tail);
    }

    public void printContents() {
        if (head == null) {
            System.out.println("LRUCache is empty");
            return;
        }

        Node currNode = head;

        String contents = "";
        while (currNode != null) {
            contents += String.format("%s ", currNode.value);
            currNode = currNode.next;
        }

        System.out.println(String.format("LRUCache contents : %s", contents));
    }

    // region Inner Classes
    private class Node {

        Node prev;
        Node next;
        int key;
        String value;

        private Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    // endregion
}
