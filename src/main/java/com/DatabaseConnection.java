package com;
public class DatabaseConnection {
    static boolean isConnected;

    public static void connect() {
        isConnected = true;
        System.out.println("Database connected");
    }

    public static void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected");
    }

    public static boolean isConnected() {
        return isConnected;
    }
}