package com.assignment.service;

import com.assignment.core.DataModel;

public class ServiceApp {
    public static void main(String[] args) {
        DataModel model = new DataModel(1, "Shared Model from core-module");
        System.out.println("Multi-module Maven project successfully executed:");
        System.out.println(model);
    }
}
