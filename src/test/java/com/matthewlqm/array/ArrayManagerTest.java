package com.matthewlqm.array;

import com.matthewlqm.node.NormalNode;
import org.junit.Assert;
import org.junit.Test;

public class ArrayManagerTest {

    private static final int DEFAULT_ARRAY_CAPACITY = 16;

    @Test
    public void testCreateArrayDefault() {
        Array array = ArrayManager.newArray();
        Assert.assertEquals(DEFAULT_ARRAY_CAPACITY, array.size());
    }

    @Test
    public void testCreateArrayWithCapacity() {
        Array array = ArrayManager.newArray(10);
        Assert.assertEquals(10, array.size());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testExpandArrayCapacity() {
        Array array = ArrayManager.newArray();
        array.setElementWithIndex(2, 1);
        Array bigArray = ArrayManager.expandCapacity(array, 22);
        Assert.assertEquals(new NormalNode(2), bigArray.getElementWithIndex(1));
        Assert.assertEquals(22, bigArray.size());
        Array smallArray = ArrayManager.expandCapacity(array, 12);
    }
}