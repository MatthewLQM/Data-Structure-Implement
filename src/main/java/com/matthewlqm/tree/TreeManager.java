package com.matthewlqm.tree;

/**
 * Created by huafu on 2017/9/22.
 */
public class TreeManager {

    public void inorderTraverseBinaryTreeReverse(BinaryTreeNode root) {
        if (root == null) return;
        inorderTraverseBinaryTreeReverse(root.getLeftNode());
        operateTreeNode(root);
        inorderTraverseBinaryTreeReverse(root.getRightNode());
    }

    public void firstOrderTraverseBinaryTreeReverse(BinaryTreeNode root) {
        if (root == null) return;
        operateTreeNode(root);
        firstOrderTraverseBinaryTreeReverse(root.getLeftNode());
        firstOrderTraverseBinaryTreeReverse(root.getRightNode());
    }

    public void postOrderTraverseBinaryTreeReverse(BinaryTreeNode root) {
        if(root == null) return;
        postOrderTraverseBinaryTreeReverse(root.getLeftNode());
        postOrderTraverseBinaryTreeReverse(root.getRightNode());
        operateTreeNode(root);
    }

    private void operateTreeNode(TreeNode treeNode) {
        System.out.print(" " + treeNode.getKey() + " ");
    }

    public static void main(String[] args) {
        BinaryTreeNode treeNode = new BinaryTreeNode(1);
        treeNode.setLeftNode(new BinaryTreeNode(2));
        treeNode.setRightNode(new BinaryTreeNode(3));
        TreeManager treeManagerManager = new TreeManager();
        treeManagerManager.inorderTraverseBinaryTreeReverse(treeNode);
        System.out.println("");
        treeManagerManager.firstOrderTraverseBinaryTreeReverse(treeNode);
        System.out.println("");
        treeManagerManager.postOrderTraverseBinaryTreeReverse(treeNode);
    }
}
