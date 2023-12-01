package com.study.effectivejavastudy.chapters.chapter1.item1.section3;

public class Character {

    private String value;
    private String color;
    private Font font;

    private Character() {
    }

    public static Character of(String value, String color, Font font) {
        Character character = new Character();
        character.value = value;
        character.color = color;
        character.font = font;
        return character;
    }
}
