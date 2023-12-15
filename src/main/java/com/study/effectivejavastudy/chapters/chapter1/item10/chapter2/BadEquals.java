package com.study.effectivejavastudy.chapters.chapter1.item10.chapter2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BadEquals {

    int value;

    public boolean equals(BadEquals o) {
        if (o == null) {
            return false;
        }
        return o.value == this.value;
    }

}
