/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important_question;

/**
 *
 * @author Israt
 */
class Node {

    int data;
    Node left;
    Node right;
}

public class Binary_Search_Tree {
    //https://www.youtube.com/watch?v=81PpYQ0AN_w

    //Binary Tree is a special type of generic tree in which, each node can have at most two children. 
    //Binary tree is generally partitioned into three disjoint subsets. 
    // Binary Search Tree(BST) is that left node always less than the parent node & right node always biger than parent node
    public Node insert(Node node, int data) {
        if (node == null) {
            return createNode(data);
        }
        if (data < node.data) {
            // int this condition Recursively Calling menthod again
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            // int this condition Recursively Calling menthod again
            node.right = insert(node.right, data);
        }
        return node;
    }

    public Node createNode(int data) {
        //First Enter 8 then right & left node is null
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node delete(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node = delete(node.left, data);
        } else if (data > node.data) {
            node = delete(node.right, data);
        } else {
            if (node.left == null) {
                //https://www.youtube.com/watch?v=JsgqnTLjfps
                Node temp = null;
                temp = node.left == null ? node.right : node.left;
                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, successor.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        } else {
            Node temp = node.left;
            while (temp != null) {
                temp = node.right;
            }
            
            return temp;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        Binary_Search_Tree bst = new Binary_Search_Tree();
        //5 3 6 10 4 7 1 4 13
        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 10);
        root = bst.insert(root, 4);
        root = bst.insert(root, 7);
        root = bst.insert(root, 1);
        root = bst.insert(root, 4);
        root = bst.insert(root, 13);
        
        root = bst.delete(root, 3);
    }

}
