package lk.himash;

import java.util.*;

public class Illustration_01 {
    public static void main(String[] args) {

//      Write a program to find the first non-repeating number in the following array
        int [] arr = new int [] {5, 4, 2, 5, 3, 8, 5, 2, 1, 8};
        HashSet<Integer> uniqueValues = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int j : arr) {
            list.add(j);
            if (!uniqueValues.add(j)) { // If the value added success true otherwise false
                duplicates.add(j);
            }
        }

        list.removeAll(duplicates);

        System.out.println("Initial non-duplicate value is : " + list.get(0));

    }

}
