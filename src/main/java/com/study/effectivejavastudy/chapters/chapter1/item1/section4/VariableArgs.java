package com.study.effectivejavastudy.chapters.chapter1.item1.section4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariableArgs {

    public static void printNum(int... nums) {
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printNum(1, 2, 3, 4, 5);
    }

}
