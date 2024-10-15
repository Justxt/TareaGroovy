package org.example

class Motocycle extends Land {
    public Motocycle(String name) {
        super(name);
    }

    @Override
    void encender() {
        println "La moto se está encendiendo"
    }

    @Override
    def void acelerar() {
        println "La moto está acelerando"
    }
}
