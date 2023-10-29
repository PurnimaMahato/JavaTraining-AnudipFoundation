//2. WAP to check whether Thread is alive or not
package com.thread.sang;

public class ThreadAliveCheckExample {

    public static void main(String[] args) {
        // Create a thread
        Thread thread = new Thread(() -> {
            // Simulate some work
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Check if the thread is alive before starting it
        if (!thread.isAlive()) {
            System.out.println("Thread is not alive before starting.");
        }

        // Start the thread
        thread.start();

        // Check if the thread is alive after starting it
        if (thread.isAlive()) {
            System.out.println("Thread is alive after starting.");
        }

        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive after it has finished
        if (!thread.isAlive()) {
            System.out.println("Thread is not alive after finishing.");
        }

        System.out.println("Main thread: All threads have finished.");
    }
}
