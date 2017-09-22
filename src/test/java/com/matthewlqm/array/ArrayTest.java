package com.matthewlqm.array;

import com.matthewlqm.node.NormalNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

    private Array<Integer> testArray;

    @Before

    public void prepareArray() {
        testArray = new Array<>();
        testArray.setElementWithIndex(10, 2);
    }

    @Test()
    public void testGet() {
        Assert.assertEquals(new NormalNode<>(10), testArray.getElementWithIndex(2));
        Assert.assertNull(testArray.getElementWithIndex(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSet() {
        testArray.setElementWithIndex(8, 1);
        Assert.assertEquals(new NormalNode<>(8), testArray.getElementWithIndex(1));
        testArray.setElementWithIndex(4, 20);
    }

    @Test()
    public void testCopy() {
        Array<Integer> newArray = new Array<>(20);
        newArray.copyArray(testArray, 0, 9);
        Assert.assertEquals(new NormalNode<>(10), testArray.getElementWithIndex(2));
        Assert.assertNull(testArray.getElementWithIndex(1));
    }
}