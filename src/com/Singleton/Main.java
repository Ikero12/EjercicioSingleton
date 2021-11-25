package com.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton miUnicaInstancia = Singleton.getInstance();

        miUnicaInstancia.setEdad(25);
        miUnicaInstancia.setNombre("Messi");

        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();

        otraInstanciaSeraLaMisma.setEdad(78);


    }
}
