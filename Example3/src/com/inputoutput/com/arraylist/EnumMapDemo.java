package com.inputoutput.com.arraylist;

import java.util.EnumMap;

public class EnumMapDemo {

    // Constants
    enum Month {
        Jan, Feb, Mar
    }

    public static void main(String[] args) {
        EnumMap<Month, Integer> enumMapCalendar = new EnumMap<Month, Integer>(Month.class);
        enumMapCalendar.put(Month.Jan, 100);
        enumMapCalendar.put(Month.Feb, 100);
        enumMapCalendar.put(Month.Mar, 100);

        System.out.println(enumMapCalendar); // {Jan=100, Feb=100, Mar=100}
    }
}
