package com.study.effectivejavastudy.chapters.chapter1.item5.chatper1.dictionary;

import com.study.effectivejavastudy.chapters.chapter1.item5.chapter1.dictionary.Dictionary;
import java.util.ArrayList;
import java.util.List;

public class TestDictionary implements Dictionary {

    @Override
    public boolean contains(String word) {
        boolean result = true;
        // do something
        return result;
    }

    @Override
    public List<String> suggestion(String input) {
        List<String> result = new ArrayList<>();
        // do something
        return result;
    }
}
