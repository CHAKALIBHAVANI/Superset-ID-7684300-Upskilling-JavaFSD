// Task 41: Executor Service and Callable
// Objective: Execute multiple Callable tasks and get results

import java.util.concurrent.*;

public class ExecutorServiceCallableDemo {

    public static void main(String[] args) throws Exception {

        // Create thread pool with 3 threads
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Callable Tasks
        Callable<String> task1 = () -> "Task 1 Completed";
        Callable<String> task2 = () -> "Task 2 Completed";
        Callable<String> task3 = () -> "Task 3 Completed";

        // Submit tasks
        Future<String> result1 = service.submit(task1);
        Future<String> result2 = service.submit(task2);
        Future<String> result3 = service.submit(task3);

        // Get results
        System.out.println(result1.get());
        System.out.println(result2.get());
        System.out.println(result3.get());

        // Shutdown executor
        service.shutdown();
    }
}
