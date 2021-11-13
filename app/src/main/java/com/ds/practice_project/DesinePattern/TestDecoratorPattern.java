package com.ds.practice_project.DesinePattern;

import com.example.practice.DesinePattern.decoderDesignPattern.Broccoli;
import com.example.practice.DesinePattern.decoderDesignPattern.Cheese;
import com.example.practice.DesinePattern.decoderDesignPattern.Chicken;
import com.example.practice.DesinePattern.decoderDesignPattern.NonVegPizza;
import com.example.practice.DesinePattern.decoderDesignPattern.Pizza;
import com.example.practice.DesinePattern.decoderDesignPattern.VegPizza;

public class TestDecoratorPattern {

    public static void main(String[] args) {
        Pizza pizza = new VegPizza();

        pizza = new Broccoli(pizza);
        pizza = new Cheese(pizza);

        System.out.println(pizza.getDes());
        System.out.println(pizza.getPrince());

        pizza = new NonVegPizza();

        pizza = new Chicken(pizza);

        System.out.println(pizza.getDes());
        System.out.println(pizza.getPrince());
    }
}
