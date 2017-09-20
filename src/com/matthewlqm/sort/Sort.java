package com.matthewlqm.sort;

import com.matthewlqm.util.CommonUtils;

public class Sort {

    public static Integer[] insertSort(Integer[] originArray) {
        Integer[] temp = new Integer[originArray.length];
        temp[0] = originArray[0];
        for (int i = 1; i < originArray.length; i++) {
            Integer k = originArray[i];
            int j = i - 1;
            while (j >= 0 && temp[j].compareTo(k) > 0) {
                temp[j + 1] = temp[j];
                j -= 1;
            }
            temp[j + 1] = k;
        }
        return temp;
    }

    public static Integer[] mergeSort(Integer[] originArray) {
        if (originArray.length == 1) {
            return originArray;
        }
        Integer[] leftArray = new Integer[originArray.length/2];
        Integer[] rightArray = new Integer[originArray.length - leftArray.length];
        System.arraycopy(originArray, 0, leftArray, 0, leftArray.length);
        System.arraycopy(originArray, originArray.length/2, rightArray, 0, rightArray.length);
        Integer[] left = mergeSort(leftArray);
        Integer[] right = mergeSort(rightArray);
        return merge(left, right);
    }

    public static void main(String[] args) {
        Integer[] originArray = new Integer[]{2, 1};
        Integer[] insertSortResult = Sort.insertSort(originArray);
        Integer[] mergeSortResult = Sort.mergeSort(originArray);
        CommonUtils.printArray("originArray", originArray);
        CommonUtils.printArray("insertSortResult", insertSortResult);
        CommonUtils.printArray("mergeSortArray",mergeSortResult);
    }

    private static Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] result = new Integer[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, index = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[index] = left[leftIndex];
                leftIndex++;
            } else {
                result[index] = right[rightIndex];
                rightIndex++;
            }
            index++;
        }
        if (leftIndex < left.length) {
            while (leftIndex < left.length) {
                result[index] = left[leftIndex];
                index++;
                leftIndex++;
            }
        } else {
            while (rightIndex < right.length) {
                result[index] = right[rightIndex];
                index++;
                rightIndex++;
            }
        }
        return result;
    }

}
