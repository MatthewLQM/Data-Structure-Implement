package com.matthewlqm.list;

import com.matthewlqm.list.listNode.SinglyLinkedListNode;

public class SinglyLinkedList<T> extends AbstractList<T> {

    private int size;

    SinglyLinkedListNode head;

    public SinglyLinkedList() {
        size = 0;
        head = null;
    }

    public SinglyLinkedList(T key) {
        size = 1;
        head = new SinglyLinkedListNode(key);
    }

    public int size() {
        return size;
    }
}
