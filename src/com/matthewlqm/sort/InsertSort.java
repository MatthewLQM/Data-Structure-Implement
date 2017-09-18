package com.matthewlqm.sort;

import com.matthewlqm.util.CommonUtils;

public class InsertSort {

    public static Integer[] insertSort(Integer[] originArray) {
        Integer[] temp = new Integer[originArray.length];
        temp[0] = originArray[0];
        for (int i = 1; i < originArray.length; i++) {
            Integer k = originArray[i];
            int j = i - 1;
            while (j >= 0 && temp[j].compareTo(k) > 0) {
                temp[j+1] = temp[j];
                j -= 1;
            }
            temp[j+1] = k;
        }
        return temp;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,3,5,2,4,6};
        Integer[] b = insertSort(a);
        CommonUtils.printArray(a);
        CommonUtils.printArray(b);
    }

}
