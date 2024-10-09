package com.edu;

import java.util.Iterator;

public class DefaultCustomArrayList<E> implements CustomArrayList<E> {
private ArrayList<E> list;
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
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.remove(element);
    }

    private void remove(int index) {
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
       return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean contains(E element) {
        return list.contains(element);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
