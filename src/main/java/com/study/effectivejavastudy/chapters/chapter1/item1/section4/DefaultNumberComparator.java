package com.study.effectivejavastudy.chapters.chapter1.item1.section4;

import java.util.Comparator;

public class DefaultNumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer int1, Integer int2) {
        return -(int1 - int2);
    }

}
