package com.study.effectivejavastudy.chapters.chapter1.item1.section4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        printList(list);

        Collections.sort(list, new DefaultNumberComparator());
        printList(list);

        Collections.sort(list, new DefaultNumberComparator().reversed());
        printList(list);
    }

    private static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }

}
