package org.example;

public class Boat extends Maritime{

    public Boat() {
        super("Boat");
    }

    @Override
    void encender() {
        System.out.println("El bote esta encendiendo");
    }
}
