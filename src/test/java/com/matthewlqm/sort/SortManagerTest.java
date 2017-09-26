package com.matthewlqm.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortManagerTest {

    private SortManager sortManagerManager;

    @Before
    public void beforeTest() {
        sortManagerManager = new SortManager();
    }

    @Test
    public void testInsertSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] insertSortArray = sortManagerManager.insertSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, insertSortArray);
    }

    @Test
    public void testSelectSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] selectSortArray = sortManagerManager.selectSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, selectSortArray);
    }

    @Test
    public void testMergeSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] mergeSortArray = sortManagerManager.mergeSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, mergeSortArray);
    }

    @Test
    public void testBubbleSort() {
        Integer[] originArray = new Integer[]{1, 4, 3, 2, 5};
        Integer[] mergeSortArray = sortManagerManager.bubbleSort(originArray);
        Integer[] expectedSortedArray = new Integer[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSortedArray, mergeSortArray);
    }
}