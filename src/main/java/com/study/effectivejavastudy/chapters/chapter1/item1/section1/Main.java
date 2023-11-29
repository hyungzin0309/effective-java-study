package com.study.effectivejavastudy.chapters.chapter1.item1.section1;

public class Main {

    public static void main(String[] args) {
        // 명확한 이름
        Book book = Book.fromTitle("자바의 정석");
        System.out.println(book.getTitle());

        Movie movie = Movie.createActionMovie("미션 임파서블");
        System.out.println(movie.getGenre());

        // 객체 재사용
        System.out.println(BooleanWrapper.of(true));
        System.out.println(BooleanWrapper.of(true));

        // 하위 타입 반환 + 매개변수에 따라 다른 타입의 객체를 반환
        Shape circle = ShapeFactory.getShape("circle");
        Shape triangle = ShapeFactory.getShape("triangle");
        System.out.println(circle.getType());
        System.out.println(triangle.getType());
    }

}
