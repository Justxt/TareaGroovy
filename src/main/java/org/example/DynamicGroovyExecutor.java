package org.example;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class DynamicGroovyExecutor {
    public static void main(String[] args) {

        String groovyCode = "def a = 5; def b = 3; return a + b";


        Binding binding = new Binding();
        GroovyShell shell = new GroovyShell(binding);
        Object result = shell.evaluate(groovyCode);
        System.out.println("Resultado inicial: " + result);

        String modifiedGroovyCode = modifyGroovyCode(groovyCode, "a * b");


        result = shell.evaluate(modifiedGroovyCode);
        System.out.println("Resultado modificado: " + result);
    }

    private static String modifyGroovyCode(String originalCode, String newExpression) {
        return originalCode.replaceFirst("return a \\+ b", "return " + newExpression);
    }
}