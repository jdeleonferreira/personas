package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText id, name, lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        id = findViewById(R.id.txtIdentification);
        name = findViewById(R.id.txtName);
        lastName = findViewById(R.id.txtLastName);
    }

    public void save(View v){
        String id, name, lastName;
        Persona p;

        id = this.id.getText().toString();
        name = this.name.getText().toString();
        lastName = this.lastName.getText().toString();

        p = new Persona(id, name, lastName);
        p.save();

        Toast.makeText(this, "Persona guardada exitosamente",Toast.LENGTH_LONG).show();
        this.clear(v);
    }

    public void clear(View v){
        this.id.setText("");
        this.name.setText("");
        this.lastName.setText("");
        this.id.requestFocus();
    }
}