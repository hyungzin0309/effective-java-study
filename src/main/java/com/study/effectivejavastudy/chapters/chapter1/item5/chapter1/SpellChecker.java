package com.study.effectivejavastudy.chapters.chapter1.item5.chapter1;


import com.study.effectivejavastudy.chapters.chapter1.item5.chapter1.dictionary.Dictionary;
import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Supplier<Dictionary> supplier) {
        this.dictionary = supplier.get();
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
