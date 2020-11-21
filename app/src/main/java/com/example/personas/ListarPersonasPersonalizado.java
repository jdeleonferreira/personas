package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarPersonasPersonalizado extends AppCompatActivity {
    private ListView list;
    private ArrayList<Persona> people;
    private Context context;
    private AdaptadorPersona adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personas_personalizado);
        list = findViewById(R.id.lstCustomPeopleList);
        people = Datos.obtener();
        adapter = new AdaptadorPersona(this,people);
        list.setAdapter(adapter);
    }
}