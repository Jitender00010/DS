package com.ds.practice_project.DesinePattern.decoderDesignPattern.decoder;

import com.example.practice.DesinePattern.decoderDesignPattern.Pizza;

abstract public class DecoderPizza implements Pizza {
    @Override
    public String getDes() {
        return "Toppings ";
    }
}
