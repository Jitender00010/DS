package com.ds.practice_project.DesinePattern.decoderDesignPattern;

import com.example.practice.DesinePattern.decoderDesignPattern.decoder.DecoderPizza;

public class Cheese extends DecoderPizza {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDes() {
        return pizza.getDes()+" Chees (+30)";
    }

    @Override
    public int getPrince() {
        return pizza.getPrince()+30;
    }
}
