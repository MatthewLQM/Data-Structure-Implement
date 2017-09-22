package com.matthewlqm.tree;

import com.matthewlqm.node.AbstractNode;

public class BinaryTreeNode<T> extends AbstractNode<T> {

    private T key;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(T key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public T getKey() {
        return this.key;
    }

    public void setKey(T key) {
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
