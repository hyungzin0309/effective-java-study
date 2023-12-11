package com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionaryFactory;

import com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionary.Dictionary;
import com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionary.KoreanDictionary;

public class KoranDictionaryFactory implements DictionaryFactory {


    @Override
    public Dictionary get() {
        Dictionary koreanDictionary = new KoreanDictionary();
        // ...
        return koreanDictionary;
    }
}
