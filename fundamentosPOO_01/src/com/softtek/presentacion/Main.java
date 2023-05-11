package com.softtek.presentacion;
import com.softtek.modelo.Campos;

/**
 * Main
 */
/*
EJERCICIO 4
Realizar una clase llamada Campos con dos métodos uno muestra y el otro
incrementa. El método Muestra, es una función que da como resultado el valor de x, El
método Incrementa: Incrementa el valor de X.,El constructor el valor inicial al campo
X.,Crear una instancia en el módulo principal de la aplicación, incrementar y mostrar el
resultado.*/

public class Main {
    public static void main(String[] args) {
        Campos campos = new Campos(5);
        System.out.println(campos.muestra());
        System.out.println(campos.incrementa());
        System.out.println(campos.muestra());

    }
}