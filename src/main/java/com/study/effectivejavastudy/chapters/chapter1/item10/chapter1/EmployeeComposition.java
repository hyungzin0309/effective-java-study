package com.study.effectivejavastudy.chapters.chapter1.item10.chapter1;

public class EmployeeComposition {

    long id;
    Person person;

    public EmployeeComposition(String name, int age, long id) {
        person = new Person(name, age);
        this.id = id;
    }

    public Person asPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EmployeeComposition)) {
            return false;
        }
        EmployeeComposition other = (EmployeeComposition) o;
        return other.person.equals(this.person) && other.id == this.id;
    }

}
