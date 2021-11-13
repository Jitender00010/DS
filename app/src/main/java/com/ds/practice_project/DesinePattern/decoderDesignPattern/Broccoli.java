package com.ds.practice_project.DesinePattern.decoderDesignPattern;

import com.example.practice.DesinePattern.decoderDesignPattern.decoder.DecoderPizza;

public class Broccoli extends DecoderPizza {

    private Pizza pizza;

    public Broccoli(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDes() {
        return pizza.getDes()+" add Broccoli (+10)";
    }

    @Override
    public int getPrince() {
        return pizza.getPrince()+10;
    }
}
