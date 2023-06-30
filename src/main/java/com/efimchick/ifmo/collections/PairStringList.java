package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List<String>  {
    private final List<String> pairedList = new ArrayList<>();



    private void addPair(String element) {
        pairedList.add(element);
        pairedList.add(element);
    }

    @Override
    public boolean add(String element) {
        addPair(element);
        return true;
    }

    @Override
    public void add(int index, String element) {
        if (index % 2 != 0) {
            index++; // Adjust the index to maintain pair integrity
        }
        pairedList.add(index, element);
        pairedList.add(index, element);
    }

    @Override
    public String remove(int index) {
        if (index % 2 != 0) {
            index--; // Adjust the index to remove the correct pair
        }
        String removedElement = pairedList.remove(index);
        pairedList.remove(index);
        return removedElement;
    }

    @Override
    public boolean remove(Object object) {
        boolean removed = false;
        int index = 0;
        while (index < pairedList.size()) {
            if (pairedList.get(index).equals(object)) {
                pairedList.remove(index);
                pairedList.remove(index);
                removed = true;
            } else {
                index += 2; // Skip to the next pair
            }
        }
        return removed;
    }

    @Override
    public String get(int index) {
        return pairedList.get(index);
    }

    @Override
    public String set(int index, String element) {
        if (index % 2 != 0) {
            index--; // Adjust the index to set the correct pair
        }
        String previousElement = pairedList.set(index, element);
        pairedList.set(index + 1, element);
        return previousElement;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        for (String element : collection) {
            addPair(element);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> collection) {
        if (index % 2 != 0) {
            index++; // Adjust the index to maintain pair integrity
        }
        for (String element : collection) {
            pairedList.add(index++, element);
            pairedList.add(index++, element);
        }
        return true;
    }

    // Remaining List methods are not implemented for brevity

    @Override
    public int size() {
        return pairedList.size();
    }

    @Override
    public boolean isEmpty() {
        return pairedList.isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return pairedList.contains(object);
    }

    @Override
    public Iterator<String> iterator() {
        return pairedList.iterator();
    }

    @Override
    public Object[] toArray() {
        return pairedList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return pairedList.toArray(a);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return pairedList.containsAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return pairedList.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return pairedList.retainAll(collection);
    }

    @Override
    public void clear() {
        pairedList.clear();
    }

    @Override
    public int indexOf(Object object) {
        return pairedList.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return pairedList.lastIndexOf(object);
    }

    @Override
    public ListIterator<String> listIterator() {
        return pairedList.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return pairedList.listIterator(index);
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return pairedList.subList(fromIndex, toIndex);
    }
}
