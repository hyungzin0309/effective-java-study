package com.study.effectivejavastudy.chapters.chapter1.item8.chapter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableImpl implements AutoCloseable {

    private final BufferedReader bufferedReader;

    public AutoCloseableImpl(String path) {
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }
}
