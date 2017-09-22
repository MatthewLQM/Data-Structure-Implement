package com.matthewlqm.array;

public class ArrayManager {

    public static <E> Array<E> newArray() {
        return new Array<E>();
    }

    public static <E> Array<E> newArray(int capacity) {
        return new Array<E>(capacity);
    }

    public static <E> Array<E> expandCapacity(Array originArray, int newCapacity) {
        if (newCapacity < originArray.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Array<E> result = newArray(newCapacity);
        result.copyArray(originArray, 0, originArray.size() - 1);
        return result;
    }
}
