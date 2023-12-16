package com.study.effectivejavastudy.chapters.chapter1.item10.chapter3;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(5);
        rectangle1.setWidth(10);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(10);
        rectangle2.setHeight(5);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
    }

}
