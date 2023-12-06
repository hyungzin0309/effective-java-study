package com.study.effectivejavastudy.chapters.chapter1.item3.chapter1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        Function<Integer, MethodReferTest> refer = MethodReferTest::new;
        List<MethodReferTest> tests = nums.stream().map(refer).toList();

        Predicate<MethodReferTest> isNotOne = (methodReferTest) -> !methodReferTest.getField().equals(1);
        List<Integer> nums2 = tests.stream().filter(isNotOne).map(MethodReferTest::getField).toList();

        Predicate<Integer> isOne = (num) -> num.equals(1);
        List<Integer> nums3 = nums.stream().filter(isOne).collect(Collectors.toList());

        Consumer<Integer> consumer = System.out::println;
        nums2.forEach(consumer);

        Supplier<MethodReferTest> refer2 = MethodReferTest::new;
        nums.forEach(MethodReferTest::new);
    }

}
