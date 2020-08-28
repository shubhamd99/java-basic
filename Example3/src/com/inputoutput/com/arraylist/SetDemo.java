package com.inputoutput.com.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        SetDemo setDemo = new SetDemo();
        Set hashSet = setDemo.createHashSet();
        Set linkedHashSet = setDemo.createLinkedHashSet();
        setDemo.printSet(hashSet);
        setDemo.printSet(linkedHashSet);

    }

    private Set<Integer> createHashSet() {
        HashSet<Integer> setOfInteger = new HashSet<>();
        setOfInteger.add(2);
        setOfInteger.add(20);
        setOfInteger.add(400);
        setOfInteger.add(40);

        return setOfInteger;
    }

    private Set createLinkedHashSet() {
        LinkedHashSet<Integer> setOfInteger = new LinkedHashSet<>();
        setOfInteger.add(2);
        setOfInteger.add(20);
        setOfInteger.add(400);
        setOfInteger.add(40);

        return setOfInteger;
    }

    private void printSet(Set setToPrint) {
        Iterator setIterator = setToPrint.iterator();
        while (setIterator.hasNext()) {
            System.out.println("Value of element in a set "+ setIterator.next());
        }
    }
}
