package com.matthewlqm.list.listNode;

import com.matthewlqm.node.Node;

public interface ListNode<T> extends Node<T> {

    void setNext(ListNode<T> nextNode);

    ListNode<T> getNext();

    void setLast(ListNode<T> lastNode);

    ListNode<T> getLast();

}