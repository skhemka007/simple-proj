package com.example.simple_proj;
import java.util.Base64;

public class UserService {

    // 🚨 Hardcoded API Key (Security Concern)
    private static final String API_KEY = "12345-SECRET-KEY";

    // 🚨 Duplicate logic in getUserInfo and getUserDetails
    public String getUserInfo(String userId) {
        if (userId == null || userId.isEmpty()) {
            return "Invalid user";
        }
        // 🚨 Repeated block
        String encoded = Base64.getEncoder().encodeToString(userId.getBytes());
        return "User Info for ID: " + encoded;
    }

    public String getUserDetails(String userId) {
        if (userId == null || userId.isEmpty()) {
            return "Invalid user";
        }
        // 🚨 Repeated block
        String encoded = Base64.getEncoder().encodeToString(userId.getBytes());
        return "Details of user: " + encoded;
    }

    // 🚨 Long method doing too much (refactor candidate)
    public void processUser(String userId) {
        if (userId == null) {
            System.out.println("User ID cannot be null");
            return;
        }

        String encodedId = Base64.getEncoder().encodeToString(userId.getBytes());
        System.out.println("Processing user ID: " + encodedId);

        try {
            Thread.sleep(1000); // Simulate slow processing
        } catch (InterruptedException e) {
            e.printStackTrace(); // 🚨 Avoid using printStackTrace
        }

        System.out.println("Done processing.");
    }
}
