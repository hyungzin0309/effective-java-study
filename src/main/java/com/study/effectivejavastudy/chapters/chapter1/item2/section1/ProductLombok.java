package com.study.effectivejavastudy.chapters.chapter1.item2.section1;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductLombok {

    // 필수 필드
    private String name;
    private Long price;

    // 옵션
    private String description;
    private String manufacturer;
    private Integer stock;

}
