package org.example;

public class Launch extends Maritime {

    public Launch() {
        super("Launch");
    }

    @Override
    void acelerar() {
        System.out.println("La lancha esta acelerando");
    }
}
