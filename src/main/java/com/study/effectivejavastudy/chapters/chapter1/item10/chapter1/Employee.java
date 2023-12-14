package com.study.effectivejavastudy.chapters.chapter1.item10.chapter1;

public class Employee extends Person {

    long id;

    public Employee(String name, int age, long id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) {
            return false;
        }
        return super.equals(o) && ((Employee) o).id == this.id;
    }

}
