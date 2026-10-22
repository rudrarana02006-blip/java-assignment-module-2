package com.assignment.validation;

public class UserRegistration {
    @NotNull(message = "Username is required")
    @MinLength(value = 4, message = "Username must have at least 4 characters")
    private String username;

    @NotNull(message = "Password is required")
    @MinLength(value = 6, message = "Password must have at least 6 characters")
    private String password;

    public UserRegistration(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
