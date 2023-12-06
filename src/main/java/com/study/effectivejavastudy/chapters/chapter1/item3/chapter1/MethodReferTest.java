package com.study.effectivejavastudy.chapters.chapter1.item3.chapter1;

public class MethodReferTest {

    private Integer field;

    public MethodReferTest() {

    }

    public MethodReferTest(Integer field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return String.valueOf(field);
    }

    public Integer getField() {
        return this.field;
    }

}
