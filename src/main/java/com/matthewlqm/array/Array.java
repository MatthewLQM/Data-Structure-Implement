package com.matthewlqm.array;

import com.matthewlqm.node.Node;
import com.matthewlqm.node.NormalNode;

public class Array<T> {

    private static final int DEFAULT_ARRAY_CAPACITY = 16;

    private Node<T>[] element;

    public Array() {
        element = new NormalNode[DEFAULT_ARRAY_CAPACITY];
    }

    public Array(int capacity) {
        element = new NormalNode[capacity];
    }

    public int size() {
        return element.length;
    }

    public void copyArray(Array<T> src, int begin, int end) {
        if (begin > end || begin < 0 || end >= src.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (end - begin >= element.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = begin; i < end; i++) {
            Node temp = src.getElementWithIndex(i);
            if (temp != null) {
                element[i - begin] = src.getElementWithIndex(i);
            }
        }
    }

    public void setElementWithIndex(T value, int index) {
        if (index >= element.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        element[index] = new NormalNode<>(value);
    }

    public Node<T> getElementWithIndex(int index) {
        if (index >= element.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (element[index] == null) {
            return null;
        }
        return element[index];
    }
}
