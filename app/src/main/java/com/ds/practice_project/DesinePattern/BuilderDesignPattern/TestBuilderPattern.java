package com.ds.practice_project.DesinePattern.BuilderDesignPattern;

import java.util.Vector;

public class TestBuilderPattern {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .name("Jitu")
                .address("jind")
                .build();

        System.out.println(user.toString());

        Vector vector;
    }
}
