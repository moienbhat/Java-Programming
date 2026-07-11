/*
 * Assignment 4: Using sleep()
 * Objective: Understand thread suspension.
 *
 * Task: Create two threads. One prints numbers 1-5 with 500 ms delay.
 * Another prints A-E with 700 ms delay. Observe interleaving.
 */

class NumberThread extends Thread {
    public NumberThread() {
        super("NumberThread");
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class LetterThread extends Thread {
    public LetterThread() {
        super("LetterThread");
    }

    @Override
    public void run() {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (char c : letters) {
            System.out.println(getName() + ": " + c);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        NumberThread numberThread = new NumberThread();
        LetterThread letterThread = new LetterThread();

        numberThread.start();
        letterThread.start();

        numberThread.join();
        letterThread.join();

        /*
         * Observation:
         * NumberThread sleeps 500ms between prints while LetterThread sleeps
         * 700ms between prints. Because NumberThread wakes up more
         * frequently, its numbers will generally appear more often in the
         * early part of the output, and the two sequences interleave based
         * on their independent timers rather than any coordination between
         * them. Since NumberThread finishes its 5 iterations (2500ms total)
         * before LetterThread finishes its 5 iterations (3500ms total),
         * NumberThread will typically complete first.
         */
        System.out.println("Both threads have finished execution.");
    }
}
