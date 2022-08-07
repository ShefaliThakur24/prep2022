package basicprac.binarytree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;


        public TreeNode(int data) {
            this.data = data;
        }
    }


    public void createBinaryTree() {
//        TreeNode first = new TreeNode(9);
//        TreeNode second = new TreeNode(2);
//        TreeNode third = new TreeNode(3);
//        TreeNode fourth = new TreeNode(4);
//
//
//        root = first;
//        first.left = second;
//        first.right = third;
//
//        second.left = fourth;

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    //Recursive PreOrder traversal of a Binary Tree in Java
//    public void preOrder(TreeNode root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//Iterative Preorder traversal of a Binary Tree in Java
    public void preOrder() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }


    //Recursive Inorder traversal of Binary Tree in Java
//    public void inorder(TreeNode root){
//        if(root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data + " ");
//        inorder(root.right);
//    }

    //Iterative Inorder traversal of a Binary Tree in Java

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }

        }

    }

    //Recursive Postorder traversal of a Binary Tree in Java
    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    public void postOrder() {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data + " ");
                    }

                } else {
                    current = temp;
                }
            }
        }
    }

    public void inOrder() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }

        }

    }


    //How to find Maximum value in a Binary Tree?(Recusrsive)



    public int findMax(TreeNode root) {
        if (root == null) {//base case to exit base case;
            return Integer.MIN_VALUE;// this min value wont effect the max value of the binary tree;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }
//How to represent Binary Search Tree in Java?

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        // bt.preOrder(bt.root);
        // bt.preOrder();
        //  bt.inorder(bt.root);
        // bt.inOrder(bt.root);
        // bt.postorder(bt.root);
        // bt.postOrder();
        //bt.inOrder();
        System.out.println(bt.findMax(bt.root));


    }
}
