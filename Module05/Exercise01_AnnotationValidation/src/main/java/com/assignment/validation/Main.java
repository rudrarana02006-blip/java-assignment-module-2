package com.assignment.validation;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        UserRegistration validUser = new UserRegistration("rudra", "pass123");
        UserRegistration invalidUser = new UserRegistration("al", "123");

        System.out.println("Validating validUser:");
        List<String> errors1 = Validator.validate(validUser);
        if (errors1.isEmpty()) {
            System.out.println("User input is valid!");
        } else {
            System.out.println("Errors: " + errors1);
        }

        System.out.println("\nValidating invalidUser:");
        List<String> errors2 = Validator.validate(invalidUser);
        if (errors2.isEmpty()) {
            System.out.println("User input is valid!");
        } else {
            System.out.println("Errors: " + errors2);
        }
    }
}
