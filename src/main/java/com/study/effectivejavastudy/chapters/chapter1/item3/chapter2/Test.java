package com.study.effectivejavastudy.chapters.chapter1.item3.chapter2;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
public class Test implements Serializable {

    //    private static final long serialVersionUID = 1L;
    private String name;
    private int num;
    private transient String notSerializeField;

    public String toString() {
        return name + " " + num + " " + notSerializeField;
    }
}
