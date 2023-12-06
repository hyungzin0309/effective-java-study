package com.study.effectivejavastudy.chapters.chapter1.item3.chapter2;

public class Main {

    public static void main(String[] args) {
//        Test test = new Test("hello son", 7, "no", "");
//        SerializeHelper.serialize(test);

        Test deserialized = SerializeHelper.deSerialize();
        System.out.println(deserialized);
    }

}
