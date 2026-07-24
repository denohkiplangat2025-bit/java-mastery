# Java Alarm Clock

## Overview

A console-based alarm clock application built in Java that allows the user to set an alarm using the 24-hour time format. The application displays a live digital clock, plays an alarm sound when the specified time is reached, and allows the user to stop the alarm by pressing **Enter**.

---

## Features

- Set an alarm using the `HH:mm:ss` format.
- Validates user input.
- Displays a live countdown clock.
- Plays a WAV audio file when the alarm time is reached.
- Stops the alarm when the user presses **Enter**.
- Uses a background thread so the clock runs independently.

---

## Java Concepts Demonstrated

- Object-Oriented Programming
- Runnable Interface
- Threading
- Date & Time API
- DateTimeFormatter
- Exception Handling
- Scanner
- AudioSystem & Clip
- File Handling
- Encapsulation

---

## Project Structure

```text
alarm-clock/
├── Main.java
├── AlarmClock.java
├── README.md
└── resources/
    └── alarm.wav
```

---

## How It Works

1. The user enters an alarm time in `HH:mm:ss` format.
2. The program validates the input.
3. A background thread continuously checks the current system time.
4. The current time is updated every second in the console.
5. When the alarm time is reached, a sound is played.
6. Pressing **Enter** stops the alarm and exits the application.

---

## What I Learned

This project helped me combine multiple Java concepts into a practical application. I learned how to work with threads, the Date & Time API, audio playback, exception handling, and object-oriented design while building a real console application.