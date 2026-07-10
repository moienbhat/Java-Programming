/*
 * Assignment 2: Concurrent Number Printing
 * Objective: Understand concurrent execution of multiple threads.
 *
 * Task: Create three threads. Thread 1 prints numbers 1-20, Thread 2 prints
 * even numbers 2-20, Thread 3 prints odd numbers 1-19. Observe and explain
 * the output sequence.
 */

class AllNumbersThread extends Thread {
    public AllNumbersThread() {
        super("Thread-1 (All Numbers)");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class EvenNumbersThread extends Thread {
    public EvenNumbersThread() {
        super("Thread-2 (Even Numbers)");
    }

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class OddNumbersThread extends Thread {
    public OddNumbersThread() {
        super("Thread-3 (Odd Numbers)");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        AllNumbersThread t1 = new AllNumbersThread();
        EvenNumbersThread t2 = new EvenNumbersThread();
        OddNumbersThread t3 = new OddNumbersThread();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        /*
         * Explanation of output sequence:
         * All three threads are started almost simultaneously and run
         * concurrently. The Java thread scheduler decides which thread gets
         * CPU time and for how long, so the lines printed by Thread-1,
         * Thread-2 and Thread-3 get interleaved in an unpredictable order.
         * The order is NOT guaranteed to be the same on every run because it
         * depends on the OS scheduler, JVM, and system load. Each thread's
         * own numbers will still print in increasing order relative to
         * itself (1,2,3... or 2,4,6... or 1,3,5...), but the relative
         * ordering between different threads' output is non-deterministic.
         */
        System.out.println("All threads have finished execution.");
    }
}
