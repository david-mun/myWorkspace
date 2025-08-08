package com.example.helidon;

import io.helidon.microprofile.server.Server;

/**
 * Main entry point for the Helidon MP application.
 */
public class Main {
    public static void main(String[] args) {
        Server.create().start();
    }
}
