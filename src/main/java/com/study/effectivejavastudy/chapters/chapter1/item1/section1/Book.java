package com.study.effectivejavastudy.chapters.chapter1.item1.section1;


import lombok.Getter;

@Getter
public class Book {

    private String title;

    private Book(){}

    public static Book fromTitle(String title) {
        Book book = new Book();
        book.title = title;
        return book;
    }
}
