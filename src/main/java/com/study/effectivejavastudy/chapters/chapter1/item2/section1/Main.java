package com.study.effectivejavastudy.chapters.chapter1.item2.section1;

public class Main {

    public static void main(String[] args) {
        Product product = Product.builder("Macbook Pro", 4_000_000L)
                .description("맥북프로")
                .manufacturer("Apple")
                .stock(0)
                .build();

        Vehicle vehicle = Vehicle.builder()
                .brand("somthing")
                .wheels(6)
                .build();

        Car car = Car.builder()
                .brand("Benz")
                .wheels(4)
                .convertable(true)
                .build();
    }

}
