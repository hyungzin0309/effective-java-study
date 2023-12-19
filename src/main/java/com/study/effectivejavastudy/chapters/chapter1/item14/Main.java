package com.study.effectivejavastudy.chapters.chapter1.item14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Test test0 = new Test(1, 3L, 4D, "hj");
        Test test1 = new Test(1, 2L, 3D, "mj");
        Test test2 = new Test(0, 2L, 3D, "jw");
        Test test3 = new Test(1, 3L, 5D, "as");

        Comparator<Test> comparator = Comparator
                .comparingInt(Test::getValue1)
                .thenComparingLong(Test::getValue2)
                .thenComparingDouble(Test::getValue3)
                .thenComparing(Test::getValue4, String.CASE_INSENSITIVE_ORDER)
                .reversed();

        Set<Test> testQueue = new TreeSet<>(comparator);
        testQueue.add(test0);
        testQueue.add(test1);
        testQueue.add(test2);
        testQueue.add(test3);

        System.out.println(testQueue);

    }

}
