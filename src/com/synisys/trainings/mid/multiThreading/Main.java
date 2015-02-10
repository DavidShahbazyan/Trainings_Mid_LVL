package com.synisys.trainings.mid.multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int threadId = atomicInteger.incrementAndGet();
                for (int i = 5; i <= 0; i--) {
                    System.out.println("Thread No. " + threadId + ": " + 5 / i);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }
}
