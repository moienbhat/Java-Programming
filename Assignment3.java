/*
 * Assignment 3: Thread Priority
 * Objective: Learn thread priorities.
 *
 * Task: Create HighPriority, MediumPriority and LowPriority threads. Assign
 * MAX_PRIORITY, NORM_PRIORITY and MIN_PRIORITY respectively. Print each
 * thread's name and priority five times. Compare execution order.
 */

class PriorityPrinterThread extends Thread {
    public PriorityPrinterThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Name: " + getName() + " | Priority: " + getPriority() + " | Count: " + i);
        }
    }
}

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        PriorityPrinterThread high = new PriorityPrinterThread("HighPriority", Thread.MAX_PRIORITY);
        PriorityPrinterThread medium = new PriorityPrinterThread("MediumPriority", Thread.NORM_PRIORITY);
        PriorityPrinterThread low = new PriorityPrinterThread("LowPriority", Thread.MIN_PRIORITY);

        // Start low first, then medium, then high to make the effect of
        // priority (if any) more observable.
        low.start();
        medium.start();
        high.start();

        low.join();
        medium.join();
        high.join();

        /*
         * Comparison of execution order:
         * Thread priority in Java is only a HINT to the thread scheduler
         * about relative importance; it does not guarantee execution order.
         * On most modern operating systems (especially those using
         * time-sliced, preemptive schedulers such as Windows or Linux), all
         * three threads will still get CPU time and their output will be
         * interleaved rather than strictly ordered by priority. You may
         * observe that HighPriority tends to get scheduled slightly more
         * often or finishes sooner on some systems, but this behavior is
         * platform-dependent and not guaranteed by the Java specification.
         */
        System.out.println("All priority threads have finished execution.");
    }
}
