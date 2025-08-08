package com.example.helidon;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * JAX-RS application configuration.
 */
@ApplicationPath("/")
public class GreetApplication extends Application {
}
