package com.study.effectivejavastudy.chapters.chapter1.item10.chapter3;

public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

}
