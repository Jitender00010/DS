package com.ds.practice_project.DesinePattern.decoderDesignPattern;

public class NonVegPizza implements Pizza {
    @Override
    public String getDes() {
        return "NonVeg Pizza = 100";
    }

    @Override
    public int getPrince() {
        return 100;
    }
}
