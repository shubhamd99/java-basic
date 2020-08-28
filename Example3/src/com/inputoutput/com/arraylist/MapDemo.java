package com.inputoutput.com.arraylist;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        MapDemo mapdemo = new MapDemo();
        mapdemo.printMap(mapdemo.createHashMap());
        mapdemo.printMap(mapdemo.createLinkedHashMap());
    }

    private Map<Integer, String> createHashMap() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Shubham");
        employeeMap.put(2, "Ayush");
        return employeeMap;
    }

    private Map<Integer, String> createLinkedHashMap() {
        Map<Integer, String> employeeMap = new LinkedHashMap<>(); // Maintain Order of insertion
        employeeMap.put(1, "Shubham");
        employeeMap.put(2, "Ayush");
        return employeeMap;
    }

    private Map<Integer, String> createTreeMap() {
        Map<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(1, "Shubham");
        employeeMap.put(2, "Ayush");
        return employeeMap;
    }

    private void printMap(Map<Integer, String> mapToPrint) {
        Set keys = mapToPrint.keySet();
        System.out.println(mapToPrint);
        System.out.println(keys);
    }
}
