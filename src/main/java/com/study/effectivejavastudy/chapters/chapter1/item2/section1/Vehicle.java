package com.study.effectivejavastudy.chapters.chapter1.item2.section1;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

public class Vehicle {

    int wheels;
    String brand;

    public static Builder<?> builder() {
        return new Builder<>();
    }

    protected Vehicle(Builder<?> builder) {
        this.wheels = builder.wheels;
        this.brand = builder.brand;
    }

    public static class Builder<T extends Builder<T>> {

        private int wheels;
        private String brand;

        public T wheels(int wheels) {
            this.wheels = wheels;
            return self();
        }

        public T brand(String brand) {
            this.brand = brand;
            return self();
        }

        public T self() {
            return (T) this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

}
