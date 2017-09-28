package com.matthewlqm.list.listNode;

import com.matthewlqm.exception.UnimplementMethodException;
import com.matthewlqm.node.AbstractNode;

public abstract class AbstractListNode<T> extends AbstractNode<T>
        implements ListNode<T> {

    @Override
    public void setNext(ListNode nextNode) {
        throw new UnimplementMethodException("AbstractListNode is not implement method setNext()");
    }

    @Override
    public ListNode getNext() {
        throw new UnimplementMethodException("AbstractListNode is not implement method getNext()");
    }

    @Override
    public void setLast(ListNode lastNode) {
        throw new UnimplementMethodException("AbstractListNode is not implement method setLast()");
    }

    @Override
    public ListNode getLast() {
        throw new UnimplementMethodException("AbstractListNode is not implement method getLast()");
    }
}
