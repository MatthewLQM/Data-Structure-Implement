package com.matthewlqm.list;

import com.matthewlqm.list.listNode.ListNode;
import com.matthewlqm.list.listNode.NormalListNode;

public class NormalList<T> extends AbstractList<T> {

    private int size;
    private int iteratorLocation;
    private ListNode<T> headNode;
    private ListNode<T> tailNode;
    private ListNode<T> iterator;

    public NormalList() {
        headNode = null;
        tailNode = null;
        iterator = null;
        size = 0;
        iteratorLocation = -1;
    }

    public NormalList(T key) {
        ListNode<T> node = new NormalListNode(key);
        headNode = tailNode = iterator = node;
        size = 1;
        iteratorLocation = 0;
    }

    @Override
    public void add(T key, int index) {
        if (index <= 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        locate(index);
        ListNode<T> node = new NormalListNode<>(key, iterator.getLast(), iterator);
        iterator.getLast().setNext(node);
        iterator.setLast(node);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        locate(index);
        return iterator.getKey();
    }

    @Override
    public void push(T key) {
        ListNode<T> tempNode = new NormalListNode<>(key);
        if (size == 0) {
            headNode = tailNode = iterator = tempNode;
            size = 1;
            iteratorLocation = 0;
        } else {
            tailNode.setNext(tempNode);
            tempNode.setLast(tailNode);
            tailNode = tempNode;
            size++;
        }
    }

    @Override
    public T pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Normal List is empty");
        } else if (size == 1) {
            ListNode<T> result = tailNode;
            headNode = tailNode = iterator = null;
            size = 0;
            iteratorLocation = -1;
            return result.getKey();
        } else {
            ListNode<T> result = tailNode;
            if (iterator == tailNode) {
                iterator = headNode;
                iteratorLocation = 0;
            }
            size--;
            tailNode = tailNode.getLast();
            tailNode.setLast(null);
            return result.getKey();
        }
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public T head() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Normal List is empty");
        }
        return headNode.getKey();
    }

    @Override
    public T tail() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Normal List is empty");
        }
        return tailNode.getKey();
    }

    @Override
    public void printList() {
        ListNode temp = headNode;
        System.out.print("listBegin -> ");
        while(temp != null) {
            System.out.print(temp.getKey() + " -> ");
        }
        System.out.println("listEnd");
    }

    private void locate(int index) {
        if (iteratorLocation > index) {
            while (iteratorLocation > index) {
                iterator = iterator.getLast();
                iteratorLocation--;
            }
        } else if (iteratorLocation < index) {
            while (iteratorLocation < index) {
                iterator = iterator.getNext();
                iteratorLocation++;
            }
        }
    }
}
