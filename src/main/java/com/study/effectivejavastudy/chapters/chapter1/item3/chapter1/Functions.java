package com.study.effectivejavastudy.chapters.chapter1.item3.chapter1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {

    public static void main(String[] args) {
        //Function -> input 과 output 이 있음
        Function<Integer, String> function = (integer) -> integer + " to String";
        Function<Integer, MethodReferTest> function2 = MethodReferTest::new;

        //Supplier -> input 이 없고 output 이 있음 (ex. 기본 생성자)
        Supplier<MethodReferTest> supplier = MethodReferTest::new;
        MethodReferTest test = supplier.get();
        System.out.println(test);

        //Consumer -> inpput 이 있고 output 이 없음 (ex. print)
        Consumer<Integer> consumer = System.out::println;

        //Predicate -> input 이 있고 boolean 리턴
        Predicate<Integer> predicate = (input) -> input.equals(1);
    }

}
