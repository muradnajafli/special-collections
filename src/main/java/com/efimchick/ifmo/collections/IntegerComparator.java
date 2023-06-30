package com.efimchick.ifmo.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class IntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return Math.abs(o1) - Math.abs(o2);
    }
}
