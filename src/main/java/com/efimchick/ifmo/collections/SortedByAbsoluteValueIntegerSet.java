package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SortedByAbsoluteValueIntegerSet implements Set<Integer> {
    private Set<Integer> integerSet = new TreeSet<>(new IntegerComparator());


    @Override
    public int size() {
        return integerSet.size();
    }

    @Override
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return integerSet.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return integerSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return integerSet.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return integerSet.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return integerSet.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return integerSet.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return integerSet.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return integerSet.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return integerSet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return integerSet.removeAll(c);
    }

    @Override
    public void clear() {
        integerSet.clear();

    }
}
