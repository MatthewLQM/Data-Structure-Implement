package com.matthewlqm.list.listNode;

import com.matthewlqm.exception.WrongTypeException;

public class NormalListNode<T> extends AbstractListNode<T> {

    private T key;
    private ListNode next;
    private ListNode last;

    public NormalListNode(T key) {
        this.key = key;
        next = last = null;
    }

    public NormalListNode(T key, ListNode last) {
        this.key = key;
        this.next = null;
        this.last = last;
    }

    public NormalListNode(T key, ListNode last, ListNode next) {
        this.key = key;
        this.next = next;
        this.last = last;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public void setNext(ListNode nextNode) {
        if (nextNode instanceof NormalListNode) {
            next = (NormalListNode) nextNode;
        }
        throw new WrongTypeException("Next Node is not NormalListNode");
    }

    @Override
    public ListNode getNext() {
        return next;
    }

    @Override
    public void setLast(ListNode lastNode) {
        if (lastNode instanceof NormalListNode) {
            last = (NormalListNode) lastNode;
        }
        throw new WrongTypeException("Last Node is not NormalListNode");
    }

    @Override
    public ListNode getLast() {
        return last;
    }
}
