// Q41: Executor Service and Callable
// Objective: Use concurrency utilities.
// Task: Execute multiple Callable tasks that return results.
// Instructions:
// - Use Executors.newFixedThreadPool() and submit() to execute callables.
// - Collect results using Future.get().

import java.util.concurrent.*;
import java.util.*;

public class Q41_ExecutorServiceCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int id = i;
            tasks.add(() -> "Task " + id + " completed");
        }

        List<Future<String>> futures = executor.invokeAll(tasks);

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
