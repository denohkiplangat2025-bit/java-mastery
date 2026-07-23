# Multithreading in Java

## Overview

This project demonstrates how multiple threads can execute concurrently using the `Runnable` interface. Two independent threads run simultaneously while the main thread waits for both to finish before continuing.

---

## What I Implemented

- Created a custom class implementing the `Runnable` interface.
- Passed different text values through the constructor.
- Created two separate `Thread` objects.
- Started both threads concurrently.
- Used `Thread.join()` to wait for both threads to complete.
- Demonstrated concurrent execution using independent tasks.

---

## Java Concepts

- Runnable interface
- Thread class
- Multithreading
- Thread.sleep()
- Thread.join()
- InterruptedException
- Constructors
- Concurrency

---

## Project Structure

```text
multithreading/
├── Main.java
├── MyRunnable.java
└── README.md
```

---

## How It Works

1. The program creates two threads.
2. One thread prints **PING**.
3. The second thread prints **PONG**.
4. Both threads execute concurrently.
5. The main thread waits for both threads to finish using `join()`.
6. After both threads complete, the program prints **GAME END!**

---

## What I Learned

This project helped me understand how Java executes multiple threads simultaneously. I learned how to create concurrent tasks using the `Runnable` interface and synchronize them using `Thread.join()`.