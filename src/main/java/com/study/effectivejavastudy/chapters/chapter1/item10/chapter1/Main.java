package com.study.effectivejavastudy.chapters.chapter1.item10.chapter1;

import java.sql.Date;
import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(1L);
        Date date = new Date(1L);

        // 상속으로 인해 대칭성이 위배된 경우
        System.out.println(timestamp.equals(date));
        System.out.println(date.equals(timestamp));

        Employee employee = new Employee("hj", 10, 1L);
        Person person = new Person("hj", 10);

        System.out.println(employee.equals(person));
        System.out.println(person.equals(employee));

        // 구성(composition) 통해 equals 규약 만족
        EmployeeComposition employeeComposition = new EmployeeComposition("hj", 10, 1L);
        EmployeeComposition employeeComposition2 = new EmployeeComposition("hj", 10, 1L);

        System.out.println(employeeComposition.equals(employeeComposition2)); // true
        System.out.println(employeeComposition.equals(null)); // false
        System.out.println(employeeComposition.asPerson().equals(person)); // true

        //false
        System.out.println(employeeComposition.equals(person));
        System.out.println(employee.equals(employeeComposition));
        System.out.println(person.equals(employeeComposition));

    }

}
