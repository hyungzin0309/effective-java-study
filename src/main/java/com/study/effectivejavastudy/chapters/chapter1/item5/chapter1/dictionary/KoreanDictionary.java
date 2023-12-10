package com.study.effectivejavastudy.chapters.chapter1.item5.chapter1.dictionary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KoreanDictionary implements Dictionary {

    private final Set<String> words = new HashSet<>();

    @Override
    public boolean contains(String word) {
        return words.contains(word);
    }

    @Override
    public List<String> suggestion(String input) {
        List<String> list = new ArrayList<>();
        //...
        return list;
    }
}
