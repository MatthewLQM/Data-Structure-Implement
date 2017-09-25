package com.matthewlqm.node;

import com.matthewlqm.exception.UnimplementMethodException;

public abstract class AbstractNode<T> implements Node<T> {

    @Override
    public T getKey() {
        throw new UnimplementMethodException("AbstractNode is not implement method getKey()");
    }

    @Override
    public void setKey(T key) {
        throw new UnimplementMethodException("AbstractNode is not implement method setKey()");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof AbstractNode) {
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
