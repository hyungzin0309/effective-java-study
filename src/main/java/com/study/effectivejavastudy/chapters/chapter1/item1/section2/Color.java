package com.study.effectivejavastudy.chapters.chapter1.item1.section2;

import lombok.Getter;

@Getter
public enum Color {
    RED("빨강"), BLUE("파랑"), GREEN("초록");

    private String name;

    Color(String name) {
        this.name = name;
    }
}
