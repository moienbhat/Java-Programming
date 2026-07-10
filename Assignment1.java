/*
 * Assignment 1: Creating Threads
 * Objective: Learn how to create and execute threads in Java.
 *
 * Task: Write a Java program to create one thread by extending the Thread
 * class and another by implementing the Runnable interface. Display numbers
 * from 1 to 10 from each thread and print the name of the currently
 * executing thread.
 */

// Thread created by extending the Thread class
class ExtendedThread extends Thread {
    public ExtendedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Thread created by implementing the Runnable interface
class RunnableTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        // Thread via extending Thread class
        ExtendedThread t1 = new ExtendedThread("ExtendedThread");

        // Thread via implementing Runnable interface
        Thread t2 = new Thread(new RunnableTask(), "RunnableThread");

        t1.start();
        t2.start();

        // Wait for both threads to finish before ending main
        t1.join();
        t2.join();

        System.out.println("Both threads have finished execution.");
    }
}
