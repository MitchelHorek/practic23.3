package com.company;

public class Array<E> {
    E[] array;

    public Array(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }

    public E at(int ind) throws MassByIndex {
        if (ind <= 0 || ind >= array.length)
            throw new MassByIndex(ind);

        return array[ind];
    }
}