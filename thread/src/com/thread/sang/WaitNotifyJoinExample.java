//1. WAP to implement wait , notify and join () example in Thread
package com.thread.sang;

public class WaitNotifyJoinExample {

    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object(); // Shared lock object

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1: Acquired the lock and is waiting...");
                try {
                    lock.wait(); // Release the lock and wait for notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Resumed execution after notification.");
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Acquired the lock and is notifying Thread 1.");
                lock.notify(); // Notify waiting Thread 1
            }
        });

        // Start Thread 1
        thread1.start();

        // Pause for a moment to ensure Thread 1 waits
        Thread.sleep(1000);

        // Start Thread 2
        thread2.start();

        // Wait for Thread 2 to complete using join
        thread2.join();

        System.out.println("Main Thread: All threads have finished execution.");
    }
}
