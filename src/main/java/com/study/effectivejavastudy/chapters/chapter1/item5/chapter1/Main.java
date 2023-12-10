package com.study.effectivejavastudy.chapters.chapter1.item5.chapter1;

import com.study.effectivejavastudy.chapters.chapter1.item5.chapter1.dictionary.KoreanDictionary;

public class Main {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(KoreanDictionary::new);
        spellChecker.isValid("인사");
        spellChecker.closeTo("바");
    }

}
