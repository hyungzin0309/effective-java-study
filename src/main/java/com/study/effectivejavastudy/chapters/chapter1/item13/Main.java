package com.study.effectivejavastudy.chapters.chapter1.item13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Test> testTreeSet = new TreeSet<>(Comparator.comparingInt(Test::getValue));
        testTreeSet.add(new Test(3));
        testTreeSet.add(new Test(1));
        testTreeSet.add(new Test(2));

        System.out.println(testTreeSet);

        for (Test test : testTreeSet) {
            System.out.println(test);
        }
    }

}
