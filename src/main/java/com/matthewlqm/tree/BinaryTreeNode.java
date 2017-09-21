package com.matthewlqm.tree;

public class BinaryTreeNode implements TreeNode {
    private Integer key;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(Integer key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public Integer getKey() {
        return this.key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }
}
