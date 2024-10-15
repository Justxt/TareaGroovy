package org.example;

import groovy.lang.GroovyClassLoader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();

        try {
            Class<?> motocycleClass = groovyClassLoader.parseClass(new File("src/main/java/org/example/Motocycle.groovy"));

            Object motocycleInstance = motocycleClass.getDeclaredConstructor(String.class).newInstance("Motocycle");


            motocycleClass.getMethod("encender").invoke(motocycleInstance);
            motocycleClass.getMethod("acelerar").invoke(motocycleInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vehicle boat = new Boat();
        Vehicle bus = new Bus();
        Vehicle launch = new Launch();

        boat.encender();
        bus.acelerar();
        launch.acelerar();

    }
}
