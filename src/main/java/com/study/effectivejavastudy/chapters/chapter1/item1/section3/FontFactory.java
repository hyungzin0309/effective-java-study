package com.study.effectivejavastudy.chapters.chapter1.item1.section3;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private static final Map<String, Font> cachedFonts = new HashMap<>();

    public static Font getFont(String fontType, int size) {
        String key = fontType + size;
        Font font = cachedFonts.get(key);
        if (font == null) {
            font = new Font(fontType, size);
            cachedFonts.put(key, font);
        }
        return font;
    }

}
