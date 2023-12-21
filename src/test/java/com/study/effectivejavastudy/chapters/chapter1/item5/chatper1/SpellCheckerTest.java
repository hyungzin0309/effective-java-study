package com.study.effectivejavastudy.chapters.chapter1.item5.chatper1;

import static org.junit.jupiter.api.Assertions.*;

import com.study.effectivejavastudy.chapters.chapter1.item5.chapter1.SpellChecker;
import com.study.effectivejavastudy.chapters.chapter1.item5.chatper1.dictionary.TestDictionary;
import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    public void testSomething() {
        SpellChecker spellChecker = new SpellChecker(TestDictionary::new);
        assertTrue(spellChecker.isValid("some word"));
    }

}