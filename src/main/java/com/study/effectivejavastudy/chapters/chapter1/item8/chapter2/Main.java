package com.study.effectivejavastudy.chapters.chapter1.item8.chapter2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (AutoCloseableImpl autoCloseable = new AutoCloseableImpl("file/path")) {
            // do something
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
