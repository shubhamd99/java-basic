package com.inputoutput.com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List carsArray = new ArrayListDemo().createArrayList();
        new ArrayListDemo().printArrayList(carsArray);
    }

    private List createArrayList() {
        List<String> cars = new ArrayList<>();
        cars.add("bmw");
        cars.add("audi");
        cars.add("mercedes");

        return cars;
    }

    private void printArrayList(List list) {
        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
