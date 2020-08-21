package com.example.com.strings;

public class Strings {
    final static String CONSTANT_EXAMPLE = "my constant";

    // StringBuffer is a peer class of String that provides much of the functionality of strings.
    private  static void stringBuff() {
        StringBuffer s1 = new StringBuffer("Shubham Dhage");
        StringBuffer newString = s1.append("!!!");
        StringBuffer insertString = s1.insert(0, 'B');

        System.out.println(newString);
        System.out.println(insertString);
    }

    public static void main(String[] args) {
        String s="Shubham";
        String s2="Shubham";
        System.out.println(s.length());
        System.out.println(s.substring(4));
        System.out.println(s.isEmpty()); // true or false

        System.out.println(s.compareTo(s2)); // 0 or -1

        int i = 100;
        System.out.println(String.valueOf(i)); // Convert to string

        String replace = s2.replace('S', 'b'); // replace
        System.out.println(replace);

        // System.out.println(replace.contains('d'));
        System.out.println(s.equals(s2));

        System.out.println(s.charAt(2));

        stringBuff();
    }
}
