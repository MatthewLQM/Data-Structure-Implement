package com.matthewlqm.list;

import com.matthewlqm.list.listNode.ListNode;
import com.matthewlqm.list.listNode.SinglyLinkedListNode;

public class SinglyLinkedList<T> extends AbstractList<T> {

    private int size;

    SinglyLinkedListNode<T> head;

    public SinglyLinkedList() {
        size = 0;
        head = null;
    }

    public SinglyLinkedList(T key) {
        size = 1;
        head = new SinglyLinkedListNode(key);
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public T get(int index) {
        if(index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ListNode<T> iterator = head;
        while(index > 0) {
            iterator = iterator.getNext();
        }
        return iterator.getKey();
    }

    @Override
    public T head() {
        if(head == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return head.getKey();
    }

    @Override
    public T tail() {
        if(head == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ListNode<T> iterator = head;
        while(iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        return iterator.getKey();
    }

    @Override
    public void add(T key, int index) {
        if(index >= size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ListNode<T> iterator = head;
        while(index > 0) {
            iterator = iterator.getNext();
            index--;
        }
        SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(key, iterator.getNext());
        iterator.setNext(temp);
    }

    @Override
    public void push(T key) {
        if(head == null) {
            head = new SinglyLinkedListNode<T>(key);
        } else {
            ListNode<T> iterator = head;
            while(iterator.getNext() != null) {
                iterator = iterator.getNext();
            }
            SinglyLinkedListNode temp = new SinglyLinkedListNode(key);
            iterator.setNext(temp);
        }
        size++;
    }

    @Override
    public T pop() {
        if(head == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ListNode<T> iterator = head;
        while(iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        T result = iterator.getKey();
        iterator = null;
        size--;
        return result;
    }
}
