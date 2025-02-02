package com.binode.stagecoachhunter.entity;

public enum UserRole {
    GOOD("The privilege User"),
    BAD ("Stage Coach Drivers"),
    UGLY ("Normal Citizens"),
    BLACK_HAT("Corrupt App Owners");

    final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
