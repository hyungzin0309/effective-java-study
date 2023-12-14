package com.study.effectivejavastudy.chapters.chapter1.item10.chapter1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        return other.age == this.age && other.name.equals(this.name);
    }

}
