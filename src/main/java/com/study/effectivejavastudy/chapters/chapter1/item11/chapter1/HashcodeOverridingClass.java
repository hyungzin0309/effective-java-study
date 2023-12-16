package com.study.effectivejavastudy.chapters.chapter1.item11.chapter1;

public class HashcodeOverridingClass {

    int value1;
    String value2;
    double value3;

    @Override
    public int hashCode() {
        int result = Integer.hashCode(value1);
        result = 31 * result + value2.hashCode();
        result = 31 * result + Double.hashCode(value3);
        return result;
    }

}
