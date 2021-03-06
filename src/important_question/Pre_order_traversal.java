/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package important_question;

import java.util.Stack;

/**
 *
 * @author Israt
 */
public class Pre_order_traversal {

    /*
 * Java Program to traverse a binary tree 
 * using PreOrder traversal without recursion. 
 * In PreOrder the node value is printed first,
 * followed by visit to left and right subtree.
    --> Root-Left-Right
 * 
 * input:
 *     a
 *    / \
 *   b   e
 *  / \   \
 * c   d   f
 * 
 * output: a b c d e f 
     */

    public static void main(String[] args) {
        // construct the binary tree given in question
        BinaryTree bt = BinaryTree.create();

        // traversing binary tree in PreOrder without using recursion
        System.out.println("printing nodes of a binary tree in preOrder using recursion");

        bt.preOrderWithoutRecursion();
    }

}

class BinaryTree {

    static class TreeNode {

        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }

        boolean isLeaf() {
            return left == null ? right == null : false;
        }

    }

    // root of binary tree
    TreeNode root;

    /**
     * Java method to visit tree nodes in PreOrder traversal without recursion.
     */
    public void preOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);

        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current.data);

            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }

    /**
     * Java method to create binary tree with test data
     *
     * @return a sample binary tree for testing
     */
    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode("a");
        tree.root = root;
        tree.root.left = new TreeNode("b");
        tree.root.left.left = new TreeNode("c");

        tree.root.left.right = new TreeNode("d");
        tree.root.right = new TreeNode("e");
        tree.root.right.right = new TreeNode("f");

        return tree;
    }

}
