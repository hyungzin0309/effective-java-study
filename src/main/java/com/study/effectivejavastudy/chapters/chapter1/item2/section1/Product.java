package com.study.effectivejavastudy.chapters.chapter1.item2.section1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

public class Product {

    // 필수 필드
    private String name;
    private Long price;

    // 옵션
    private String description;
    private String manufacturer;
    private Integer stock;

    private Product(Builder builder) {
        name = builder.name;
        price = builder.price;
        description = builder.description;
        manufacturer = builder.manufacturer;
        stock = builder.stock;
    }

    public static Builder builder(String name, Long price) {
        return new Builder(name, price);
    }

    public static class Builder {

        private String name;
        private Long price;
        private String description;
        private String manufacturer;
        private Integer stock;

        public Builder(String name, Long price) {
            this.name = name;
            this.price = price;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder stock(Integer stock) {
            this.stock = stock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }


}

