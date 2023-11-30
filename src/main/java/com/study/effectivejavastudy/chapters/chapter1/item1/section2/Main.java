package com.study.effectivejavastudy.chapters.chapter1.item1.section2;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Color, String> enumMap = new EnumMap<>(Color.class);
        Set<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        for (Color color : Color.values()) {
            enumMap.put(color, color.getName());
        }
    }

}
