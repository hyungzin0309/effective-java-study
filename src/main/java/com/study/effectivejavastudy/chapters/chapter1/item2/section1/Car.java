package com.study.effectivejavastudy.chapters.chapter1.item2.section1;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

public class Car extends Vehicle {

    boolean isConvertable;

    public static Builder builder() {
        return new Builder();
    }

    protected Car(Builder builder) {
        super(builder);
        this.isConvertable = builder.isConvertable;
    }

    public static class Builder extends Vehicle.Builder<Builder> {

        private boolean isConvertable;

        public Builder convertable(boolean isConvertable) {
            this.isConvertable = isConvertable;
            return self();
        }

        public Builder self() {
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }


}
