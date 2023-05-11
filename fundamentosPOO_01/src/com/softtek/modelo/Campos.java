/* EJERCICIO 4
Realizar una clase llamada Campos con dos métodos uno muestra y el otro
incrementa. El método Muestra, es una función que da como resultado el valor de x, El
método Incrementa: Incrementa el valor de X.,El constructor el valor inicial al campo
X.,Crear una instancia en el módulo principal de la aplicación, incrementar y mostrar el
resultado.*/
package com.softtek.modelo;

public class Campos {
    public int x;

    public Campos(int x){
        this.x = x;
    }

    public int incrementa(){
        return x++;
    }

    public int muestra(){
        return x;
    }
}
