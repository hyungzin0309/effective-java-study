package com.study.effectivejavastudy.chapters.chapter1.item1.section1;

public class ShapeFactory {

    public static Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        }
        return new DefaultShape();
    }

}
