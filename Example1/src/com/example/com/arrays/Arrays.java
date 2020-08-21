package com.example.com.arrays;

public class Arrays {

    private void arrayExample(String[] args) {
        int[] arrayOfIneteger = new int[]{5,6,7};
        int[] array = {2,4,5,6,7,8};
        System.out.println(array[0]);
        System.out.println(array[1]);

        // 3*2
        int[][] multidimesnionalArray = {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println("Length: " + multidimesnionalArray[0].length);
    }

    public static void main(String[] args) {
        // Creating Array of characters
        char[] source = {'S', 'H', 'U', 'B', 'H', 'A', 'M'};
        char[] destination = new char[7];

        // Copying elements from one array to another;
        System.arraycopy(source, 0, destination, 1, 5);
        System.out.println(new String(destination));

        // Deleting From Array
        // We cannot delete from array, we have to shift them
        int flag = 3; // element to be deleted
        for (int i = 0; i < source.length; i++) {
            // Delete FUnction
            if (flag == i) {
                for (int j = i + 1; i < source.length - 1; j++) {
                    source[i] = source[j];
                    i++;
                }
                System.out.println(source);
            }
        }

    }
}
