package com.matthewlqm.sort;

public class SortManager {

    public Integer[] insertSort(Integer[] originArray) {
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

    public Integer[] selectSort(Integer[] originArray) {
        Integer[] result = new Integer[originArray.length];
        System.arraycopy(originArray, 0, result, 0, originArray.length);
        for (int i = 0; i < result.length; i++) {
            int j = locateLowest(result, i);
            swapElement(result, i, j);
        }
        return result;
    }

    public Integer[] mergeSort(Integer[] originArray) {
        if (originArray.length == 1) {
            return originArray;
        }
        Integer[] leftArray = new Integer[originArray.length / 2];
        Integer[] rightArray = new Integer[originArray.length - leftArray.length];
        System.arraycopy(originArray, 0, leftArray, 0, leftArray.length);
        System.arraycopy(originArray, originArray.length / 2, rightArray, 0, rightArray.length);
        Integer[] left = mergeSort(leftArray);
        Integer[] right = mergeSort(rightArray);
        return merge(left, right);
    }

    public Integer[] bubbleSort(Integer[] originArray) {
        Integer[] result = new Integer[originArray.length];
        System.arraycopy(originArray, 0, result, 0, originArray.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    swapElement(result, i, j);
                }
            }
        }
        return result;
    }

    private Integer[] merge(Integer[] left, Integer[] right) {
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

    private void swapElement(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int locateLowest(Integer[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i].compareTo(array[lowIndex]) < 0) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}

