package com.edu;

import java.util.Iterator;

public class DefaultCustomArrayList<E> implements CustomArrayList<E> {

    public DefaultCustomArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
    }
    
    @Override
    public boolean add(E element) {
        return true;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    private void remove(int index) {
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
