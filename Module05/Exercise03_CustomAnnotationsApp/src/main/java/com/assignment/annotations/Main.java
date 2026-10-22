package com.assignment.annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<DataProcessor> clazz = DataProcessor.class;
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name() + " | Version: " + author.version());
        }

        DataProcessor processor = new DataProcessor();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TrackTime.class)) {
                long start = System.currentTimeMillis();
                method.invoke(processor);
                long elapsed = System.currentTimeMillis() - start;
                System.out.println("Method '" + method.getName() + "' finished in: " + elapsed + " ms");
            }
        }
    }
}
