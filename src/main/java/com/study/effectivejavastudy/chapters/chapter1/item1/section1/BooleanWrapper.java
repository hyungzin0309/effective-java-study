package com.study.effectivejavastudy.chapters.chapter1.item1.section1;
public class BooleanWrapper {
    private static final BooleanWrapper TRUE = new BooleanWrapper(true);
    private static final BooleanWrapper FALSE = new BooleanWrapper(false);

    private boolean value;

    private BooleanWrapper(boolean value) {
        this.value = value;
    }

    public static BooleanWrapper of(boolean value) {
        return value ? TRUE : FALSE;
    }
}

    // 사용 예
