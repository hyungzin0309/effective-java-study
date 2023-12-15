package com.study.effectivejavastudy.chapters.chapter1.item10.chapter2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GoodEquals {

    int value;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GoodEquals)) {
            return false;
        }
        GoodEquals other = (GoodEquals) o;
        return other.value == this.value;
    }

}
