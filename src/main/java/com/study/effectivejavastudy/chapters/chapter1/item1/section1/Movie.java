package com.study.effectivejavastudy.chapters.chapter1.item1.section1;

import lombok.Getter;

@Getter
public class Movie {

    private String title;
    private Genre genre;

    private Movie(){}

    public static Movie createActionMovie(String title){
        Movie movie = new Movie();
        movie.genre = Genre.ACTION;
        movie.title = title;
        return movie;
    }

    public enum Genre{
        ACTION, SF
    }

}
