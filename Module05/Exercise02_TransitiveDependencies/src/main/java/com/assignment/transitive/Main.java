package com.assignment.transitive;

public class Main {
    public static void main(String[] args) {
        System.out.println("Transitive Dependencies Demonstration in Maven");
        System.out.println("Declared direct dependency: org.springframework:spring-context");
        System.out.println("Transitive dependencies pulled automatically: spring-core, spring-beans, spring-aop, spring-expression");
        System.out.println("Excluded transitive dependency via <exclusions>: spring-jcl");
    }
}
