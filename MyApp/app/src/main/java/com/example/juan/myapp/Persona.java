package com.example.juan.myapp;

/**
 * Created by Juan on 17/07/2016.
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona (String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre()
    {
        return this.nombre;
    }

}
