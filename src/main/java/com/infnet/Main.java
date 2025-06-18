package com.infnet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Soma: " + somar(1.0, 50.0));
    }

    public static Double somar(Double a, Double b) {
        return a + b;
    }
}
