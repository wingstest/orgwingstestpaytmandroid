package com.example.orgwingstestpaytmandroid;

import java.util.UUID;

public class Helper {

    public static String generateRandomString() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
