package com.matthewlqm.sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    @Test
    public void testInsertSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] insertSortArray = Sort.insertSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, insertSortArray);
    }

    @Test
    public void testMergeSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] mergeSortArray = Sort.mergeSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, mergeSortArray);
    }
}