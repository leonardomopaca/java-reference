package com.mopaca.javareference.numbers;

import java.util.ArrayList;
import java.util.List;

public class Organize {
    public static void main(String[] args) {
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(5);
        arr2.add(1);
        arr2.add(4);
        arr2.add(2);
        arr2.add(9);
        arr2.add(6);
        test(arr2);
    }

    public static void test(List<Integer> arr2){
        arr2.stream().sorted().forEach(System.out::println);
    }
}
