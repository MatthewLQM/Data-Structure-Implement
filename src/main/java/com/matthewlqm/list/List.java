package com.matthewlqm.list;

public interface List<T> {
    void add(T key, int index);
    T get(int index);
    void push(T key);
    T pop();
    int length();
}
