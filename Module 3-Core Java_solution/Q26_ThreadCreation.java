// Q26: Thread Creation
// Objective: Implement multithreading.
// Task: Create and run two threads that print messages.
// Instructions:
// - Define a class that extends Thread or implements Runnable.
// - In the run() method, print a message multiple times.
// - Start both threads and observe the output.

class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - iteration " + (i + 1));
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q26_ThreadCreation {
    public static void main(String[] args) {
        MessageThread t1 = new MessageThread("Thread 1 message");
        MessageThread t2 = new MessageThread("Thread 2 message");

        t1.start();
        t2.start();
    }
}
