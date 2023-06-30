package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue implements Queue<Integer> {

    private final LinkedList<Integer> queue = new LinkedList<>();


    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return queue.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {

        return queue.iterator();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        if (queue.add(integer)) {
            range();
            return true;

        } else {
            return false;
        }
    }
    @Override
    public boolean remove(Object o) {
        if (queue.remove(o)) {
            range();
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return queue.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        queue.addAll(c);
        range();
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (queue.removeAll(c)) {
            range();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return queue.retainAll(c);
    }

    @Override
    public void clear() {
        queue.clear();

    }

    @Override
    public boolean offer(Integer integer) {
        queue.offer(integer);
        range();
        return true;
    }

    @Override
    public Integer remove() {
        Integer removed = queue.remove();
        range();
        return removed;
    }
    @Override
    public Integer poll() {
        Integer polled = queue.remove();
        range();
        return polled;
    }

    @Override
    public Integer element() {
        return queue.element();
    }

    @Override
    public Integer peek() {
        return queue.peek();
    }

    private void range() {
        LinkedList<Integer> linkedList = new LinkedList<>(queue);
        Collections.sort(linkedList);
        clear();
        int initialsize = linkedList.size();

        for (int i = 0; i < initialsize; i++) {
            if (isEven(i)) {
                queue.addFirst(linkedList.pollLast());
            } else {
                queue.addFirst(linkedList.pollFirst());
            }

        }
    }

    private boolean isEven(Integer integer) {
        return integer % 2 == 0;
    }

}
