import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class exec_scenarios {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of above class
        // in the main() method
        Task task = new Task("CAP Team");

        // Creating object of ExecutorService class and
        // Future object Class
        ExecutorService executorService
                = Executors.newFixedThreadPool(4);
        Future<String> result
                = executorService.submit(task);

        // Try block to check for exceptions
        try {
            System.out.println(result.get());
        }

        // Catch block to handle the exception
        catch (InterruptedException
               | ExecutionException e) {

            // Display message only
            System.out.println(
                    "Error occurred while executing the submitted task");

            // Print the line number where exception occurred
            e.printStackTrace();
        }

        // Cleaning resource and shutting down JVM by
        // saving JVM state using shutdown() method
        executorService.shutdown();
    }

}
