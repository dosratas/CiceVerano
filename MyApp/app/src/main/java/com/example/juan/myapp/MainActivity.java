package com.example.juan.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(getClass().getCanonicalName(),"Se ha iniciado la actividad ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona persona=new Persona("Zoraida",32);

        Log.i(getClass().getCanonicalName(),"Se ha creado la Persona ");

        String nombre_persona=persona.getNombre();

        Log.i(getClass().getCanonicalName(),"Se ha obtenido el nombre de la persona");

       int numero_letras= nombre_persona.length();
        Log.d(getClass().getCanonicalName(),"Numero de letras de nombre="+numero_letras);

        Alumno alumno= new Alumno(9);
        if(alumno instanceof Persona)
        {
            //Alumno es una Persona
            Log.d(getClass().getCanonicalName(),"El alumno es una Persona");

            String nombre_alumno=alumno.getNombre();
            if(nombre_alumno!=null)
            {
                Log.d(getClass().getCanonicalName(),"El nombre del alumno NO es null");
            }else
            {
                Log.d(getClass().getCanonicalName(),"El nombre del alumno SI es null");
            }
        }else
        {
            //Alumno no es una persona.
            Log.d(getClass().getCanonicalName(),"El alumno no es una Persona");
        }
    }
}
