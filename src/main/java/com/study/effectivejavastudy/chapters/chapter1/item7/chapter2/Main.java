package com.study.effectivejavastudy.chapters.chapter1.item7.chapter2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.scheduling.config.Task;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            try {
                Thread.sleep(2000L);
                System.out.println("히히");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();

        System.out.println(Thread.currentThread() + " hello");

    }

    public static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
                System.out.println(Thread.currentThread() + " world");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
