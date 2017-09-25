package com.matthewlqm.list;

import com.matthewlqm.exception.UnimplementMethodException;

public abstract class AbstractList<T> implements List<T> {

    @Override
    public void add(T key, int index) {
        throw new UnimplementMethodException("AbstractList is not implement method add()");
    }

    @Override
    public T get(int index) {
        throw new UnimplementMethodException("AbstractList is not implement method get()");
    }

    @Override
    public void push(T key) {
        throw new UnimplementMethodException("AbstractList is not implement method push()");
    }

    @Override
    public T pop() {
        throw new UnimplementMethodException("AbstractList is not implement method pop()");
    }

    @Override
    public int length() {
        throw new UnimplementMethodException("AbstractList is not implement method length()");
    }

}
