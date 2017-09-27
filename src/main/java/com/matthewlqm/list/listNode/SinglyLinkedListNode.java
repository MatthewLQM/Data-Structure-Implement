package com.matthewlqm.list.listNode;

import com.matthewlqm.exception.UnimplementMethodException;
import com.matthewlqm.exception.WrongTypeException;
import com.matthewlqm.list.List;

public class SinglyLinkedListNode<T> extends AbstractListNode<T> {

    private T key;
    private ListNode next;

    public SinglyLinkedListNode(T key) {
        this.key = key;
        this.next = null;
    }

    public SinglyLinkedListNode(T key, ListNode next) {
        if (!(next instanceof SinglyLinkedListNode)) {
            throw new WrongTypeException("Next Node is not SinglyLinkedListNode");
        }
        this.key = key;
        this.next = next;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public T getKey() {
        return this.key;
    }

    @Override
    public void setNext(ListNode next) {
        if (next instanceof SinglyLinkedListNode) {
            this.next = next;
        }
        throw new WrongTypeException("Next Node is not SinglyLinkedListNode");
    }

    @Override
    public ListNode getNext() {
        return this.next;
    }

    @Override
    public void setLast(ListNode lastNode) {
        throw new UnimplementMethodException("SinglyLinkedListNode is not implement method setLast()");
    }

    @Override
    public ListNode getLast() {
        throw new UnimplementMethodException("SinglyLinkedListNode is not implement method getLast()");
    }
}
