package lk.himash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Illustration_02 {
    public static void main(String[] args) {

//      Write a program to find the all repeating numbers & non-repeating numbers & remove duplicates in the following array
        int [] arr = new int [] {5, 4, 2, 5, 3, 8, 5, 2, 1, 8};
        List<Integer> list = new ArrayList<>();
        Set<Integer> nonRepeatNo = new HashSet<>();
        List<Integer> repeatNo = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(!nonRepeatNo.add(arr[i])) {
                repeatNo.add(arr[i]);
            }
        }

        list.removeAll(repeatNo);

        System.out.println("without duplicates : " + list);
        System.out.println("duplicates : " + repeatNo);
        System.out.println("non duplicates : " + nonRepeatNo);

    }
}
