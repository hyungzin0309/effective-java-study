package com.study.effectivejavastudy.chapters.chapter1.item1.section3;

// 플라이웨이트 패턴
public class Main {

    public static void main(String[] args) {
        Character character1 = Character.of("string1", "black", FontFactory.getFont("GODIC", 1));
        Character character2 = Character.of("string2", "blue", FontFactory.getFont("GODIC", 1));
        Character character3 = Character.of("string3", "red", FontFactory.getFont("GODIC", 1));
    }

}
