package org.example;

public class Main {
    public static void main(String[] args) {


        String[] nombres = {"Rubén", "Pedro", "Maria", "Juan"};

        String salida = "";
        for(String nombre : nombres) {
            salida += nombre+" ";
        }
        System.out.println("Los nombres son: "+salida);

    }
}