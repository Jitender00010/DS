package com.ds.practice_project.DesinePattern.decoderDesignPattern;

import com.example.practice.DesinePattern.decoderDesignPattern.decoder.DecoderPizza;

public class Chicken extends DecoderPizza {
    private Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDes() {
        return pizza.getDes()+" Chicken(+60)";
    }

    @Override
    public int getPrince() {
        return pizza.getPrince()+60;
    }
}
