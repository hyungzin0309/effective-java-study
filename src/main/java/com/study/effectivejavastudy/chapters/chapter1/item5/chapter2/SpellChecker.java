package com.study.effectivejavastudy.chapters.chapter1.item5.chapter2;


import com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionary.Dictionary;
import com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionaryFactory.DictionaryFactory;
import java.util.List;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(DictionaryFactory factory) {
        this.dictionary = factory.get();
    }

    public boolean isValid(String word) {
        // ...
        return dictionary.contains(word);
    }

    public List<String> closeTo(String typo) {
        // ...
        return dictionary.suggestion(typo);
    }

}
