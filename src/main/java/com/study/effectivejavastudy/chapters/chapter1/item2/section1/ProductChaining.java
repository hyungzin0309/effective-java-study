package com.study.effectivejavastudy.chapters.chapter1.item2.section1;

public class ProductChaining {

    // 필수 필드
    private String name;
    private double price;

    // 선택적 필드
    private String description;
    private String manufacturer;
    private int stock;

    public ProductChaining(String name, double price) {
        this(name, price, "", "", 0);
    }

    public ProductChaining(String name, double price, String description) {
        this(name, price, description, "", 0);
    }

    public ProductChaining(String name, double price, String description, String manufacturer) {
        this(name, price, description, manufacturer, 0);
    }

    public ProductChaining(String name, double price, String description, String manufacturer, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.stock = stock;
    }

}
