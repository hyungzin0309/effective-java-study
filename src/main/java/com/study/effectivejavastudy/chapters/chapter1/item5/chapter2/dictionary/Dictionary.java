package com.study.effectivejavastudy.chapters.chapter1.item5.chapter2.dictionary;

import java.util.List;

public interface Dictionary {

    boolean contains(String word);

    List<String> suggestion(String input);

}
