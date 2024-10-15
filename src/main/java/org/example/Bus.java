package org.example;

public class Bus extends Land {

    public Bus(){
        super("Bus");
    }

    @Override
    void acelerar() {
        System.out.println("El bus esta acelerando");
    }
}
