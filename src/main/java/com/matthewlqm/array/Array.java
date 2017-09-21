package com.matthewlqm.array;

public class Array {

    private static final int DEFAULT_ARRAY_CAPACITY = 16;

    private Integer[] element;

    public Array() {
        element = new Integer[DEFAULT_ARRAY_CAPACITY];
    }

    public Array(int capacity) {
        element = new Integer[capacity];
    }

    public void setElementWithIndex(Integer value, int index) {
        if (index >= element.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        element[index] = value;
    }

    public Integer getElementWithIndex(int index) {
        if (index >= element.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return element[index];
    }
}
