// Q40: Virtual Threads (Java 21)
// Objective: Use lightweight threads for scalable concurrency.
// Task: Launch 100,000 virtual threads that each print a message.
// Instructions:
// - Use Thread.startVirtualThread(() -> { ... }).
// - Measure performance versus traditional threads.

public class Q40_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        int count = 100_000;
        Thread[] threads = new Thread[count];

        long start = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            threads[i] = Thread.startVirtualThread(() -> {
                // Just a simple print; comment out if too slow
                // System.out.println("Hello from virtual thread");
            });
        }

        for (Thread t : threads) {
            t.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("Completed " + count + " virtual threads in " + (end - start) + " ms");
    }
}
