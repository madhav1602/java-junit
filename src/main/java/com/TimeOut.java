package com;
public class TimeOut {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}
