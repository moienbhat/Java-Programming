/*
 * Assignment 5: Thread Priority Demonstration
 * Objective: Analyze priorities.
 *
 * Task: Create five threads with priorities from 1 to 10. Each prints its
 * name 10 times. Record execution over multiple runs and conclude whether
 * higher priorities always execute first.
 */

class NamedPriorityThread extends Thread {
    public NamedPriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " [Priority=" + getPriority() + "] -> iteration " + i);
        }
    }
}

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        // Five threads with priorities spread across the valid range 1-10.
        // (Thread.MIN_PRIORITY = 1, Thread.MAX_PRIORITY = 10)
        NamedPriorityThread p1 = new NamedPriorityThread("Thread-P1", 1);
        NamedPriorityThread p3 = new NamedPriorityThread("Thread-P3", 3);
        NamedPriorityThread p5 = new NamedPriorityThread("Thread-P5", 5);
        NamedPriorityThread p7 = new NamedPriorityThread("Thread-P7", 7);
        NamedPriorityThread p10 = new NamedPriorityThread("Thread-P10", 10);

        NamedPriorityThread[] threads = { p1, p3, p5, p7, p10 };

        for (NamedPriorityThread t : threads) {
            t.start();
        }

        for (NamedPriorityThread t : threads) {
            t.join();
        }

        /*
         * Conclusion (record this after running the program multiple times):
         * Running this program several times will typically show that the
         * order in which lines from different threads appear changes from
         * run to run, and that the thread with the highest priority
         * (Thread-P10) does NOT always finish first or print all of its
         * lines before lower-priority threads.
         *
         * This is because Thread.setPriority() only provides a hint to the
         * underlying OS thread scheduler about relative importance. The
         * Java Language Specification does not guarantee that higher
         * priority threads are scheduled before lower priority ones, and
         * most modern operating systems use preemptive, time-sliced
         * scheduling that gives every runnable thread a fair share of CPU
         * time regardless of priority. Therefore:
         *
         *   Higher priority threads MAY be favored more often by the
         *   scheduler, but they do NOT always execute first, and execution
         *   order is ultimately platform- and JVM-dependent, not
         *   deterministic.
         */
        System.out.println("All priority threads have finished execution.");
    }
}
