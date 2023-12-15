package com.study.effectivejavastudy.chapters.chapter1.item10.chapter2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        GoodEquals goodEquals1 = new GoodEquals(1);
        GoodEquals goodEquals2 = new GoodEquals(1);
        List<GoodEquals> goodList = List.of(goodEquals1);

        BadEquals badEquals1 = new BadEquals(1);
        BadEquals badEquals2 = new BadEquals(1);
        List<BadEquals> badList = List.of(badEquals1);

        // good - true, true
        System.out.println(goodEquals1.equals(goodEquals2));
        System.out.println(goodList.contains(goodEquals2));

        //bad
        System.out.println(badEquals1.equals(badEquals2));
        System.out.println(badList.contains(badEquals2));

        System.out.println();
        System.out.println("===========================");
        System.out.println();

        RecordAddress address = new RecordAddress("Korea", "seoul", 132);
        RecordAddress address2 = new RecordAddress("Korea", "seoul", 132);
        Set<RecordAddress> set = new HashSet<>();
        set.add(address);

        System.out.println(address.city());
        System.out.println(address.country());
        System.out.println(address.equals(address2));
        System.out.println(set.contains(address2));
        System.out.println(address);
    }

}
