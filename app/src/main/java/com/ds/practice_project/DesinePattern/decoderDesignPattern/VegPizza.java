package com.ds.practice_project.DesinePattern.decoderDesignPattern;

public class VegPizza implements Pizza {
    @Override
    public String getDes() {
        return "VegPizza = 40 ";
    }

    @Override
    public int getPrince() {
        return 40;
    }
}
