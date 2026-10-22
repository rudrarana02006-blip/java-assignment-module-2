package com.assignment.validation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Object obj) throws IllegalAccessException {
        List<String> errors = new ArrayList<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(obj);

            if (field.isAnnotationPresent(NotNull.class)) {
                NotNull notNull = field.getAnnotation(NotNull.class);
                if (value == null) {
                    errors.add(notNull.message());
                }
            }

            if (field.isAnnotationPresent(MinLength.class)) {
                MinLength minLength = field.getAnnotation(MinLength.class);
                if (value instanceof String str) {
                    if (str.length() < minLength.value()) {
                        errors.add(minLength.message());
                    }
                }
            }
        }
        return errors;
    }
}
