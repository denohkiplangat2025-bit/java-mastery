import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Multithreading allows multiple threads to execute concurrently.
        // It is poweful for background tasks and improving application responsiveness.

        Thread pingThread = new Thread(new MyRunnable("PING"));
        Thread pongThread = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START! ");

        pingThread.start();
        pongThread.start();

        try {
            pingThread.join();
            pongThread.join();
        }

        catch (InterruptedException e ){
            System.out.println("Main Thread was interrupted");
        }

        System.out.println("GAME END!");

    }
}