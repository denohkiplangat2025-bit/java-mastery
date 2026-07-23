import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously.
        //             Helps improve performance with time-consuming operations(File Input/Output,
        //             network communications, or any background tasks)

        // How to create a Thread
        // Option1 = extend the Thread class (simpler)
        // Option2 = implement the Runnable interface(better)

        Scanner scanner = new Scanner(System.in);
        System.out.print("You have 5 seconds to enter your name: ");

        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);
        thread.setDaemon(true);
        thread.start();

        String name = scanner.nextLine();
        System.out.println("Hello, " + name);


        scanner.close();
    }
}
