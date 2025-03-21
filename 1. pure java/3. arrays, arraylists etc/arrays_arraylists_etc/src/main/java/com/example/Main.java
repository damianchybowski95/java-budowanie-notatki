package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello arrays!");

        // Create an array of integers with a size of 10
        int[] a1 = new int[10];
        a1[0] = 1;
        // Fill the entire array with the value 2
        Arrays.fill(a1, 2);
        System.out.println(a1[0]);
        System.out.println(a1.length);
        String[] aStrings = {"one", "two", "three"};
        System.out.println(aStrings[0]);
        System.out.println(aStrings.length);

        int[] oneToTen = IntStream.rangeClosed(0,10).toArray();
        System.out.println(oneToTen[0]);
        System.out.println(oneToTen.length);
        
        for ( int x : oneToTen ) System.out.print(x + " ");
        System.out.println();

        // Perform a binary search for the value 2 in the oneToTen array, returning the index
        System.out.println(Arrays.binarySearch(oneToTen, 2));

        int a3[][] = new int[2][2];
        int a4[][] = {
            {1, 2},
            {3, 4}
        };

        int a5[][][] = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };
        System.out.println(a5[0][1][1]);

        // ArrayList resizable array
        ArrayList<String> aList = new ArrayList<String>(10);
        aList.add("one");
        ArrayList<Integer> aList2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(aList2.get(0));
        aList2.add(6);
        for( Integer x : aList2 ) System.out.print(x + " ");
        System.out.println();
        aList2.set(0,10);
        aList2.remove(2);
        for( Integer x : aList2 ) System.out.print(x + " ");
        System.out.println();

        Iterator iter = aList2.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        // LinkedList - każdy element ma informacje o elemencie poprzednim i następnym
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.addAll(Arrays.asList(1,2,3,4,5));
        linkedList1.forEach(x -> System.out.print(x + " "));
    }
}