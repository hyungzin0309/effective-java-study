package com.study.effectivejavastudy.chapters.chapter1.item5.chapter2;

import com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionaryFactory.KoranDictionaryFactory;

public class Main {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(new KoranDictionaryFactory());
        spellChecker.isValid("인사");
        spellChecker.closeTo("바");
    }

}
