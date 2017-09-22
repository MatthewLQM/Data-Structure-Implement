package com.matthewlqm.node;

/**
 * Created by huafu on 2017/9/22.
 */
public class NormalNode<T> extends AbstractNode<T> {

    private T key;

    public NormalNode(T key) {
        this.key = key;
    }

    @Override
    public T getKey() {
        return this.key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof NormalNode) {
            if (((Node) o).getKey().equals(getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return getKey().hashCode();
    }
}
