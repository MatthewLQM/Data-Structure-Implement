package com.matthewlqm.util;

public class CommonUtils {
    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i].toString() + " ");
        }
        System.out.println(array[array.length - 1].toString());
    }
}
