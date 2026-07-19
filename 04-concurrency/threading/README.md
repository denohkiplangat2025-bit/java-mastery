# Threading in Java

## Overview

This project demonstrates how to create and execute a thread using the `Runnable` interface. A background thread runs concurrently while the main thread waits for user input.

---

## What I Implemented

- Created a class that implements the `Runnable` interface.
- Overrode the `run()` method.
- Used `Thread.sleep()` to pause execution for one second between iterations.
- Created and started a thread from the main class.
- Configured the thread as a daemon thread.
- Accepted user input while the background thread executed.
- Demonstrated concurrent execution of the main thread and a worker thread.

---

## Java Concepts

- Runnable interface
- Thread class
- Creating and starting threads
- Daemon threads
- Thread.sleep()
- InterruptedException
- Scanner
- Concurrency

---

## Project Structure

```text
threading/
├── Main.java
├── MyRunnable1.java
└── README.md
```

---

## How It Works

1. The user is prompted to enter their name.
2. A daemon thread starts running in the background.
3. The background thread counts for five seconds.
4. If five seconds pass, it prints **"Time's up!"**.
5. Meanwhile, the main thread waits for the user's input and greets the user if the name is entered in time.

---

## What I Learned

This project helped me understand how Java threads run independently of the main program. By implementing the `Runnable` interface, I learned a flexible way to perform background tasks while the main thread continues executing.