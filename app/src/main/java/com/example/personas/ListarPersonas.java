package com.example.personas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListarPersonas extends AppCompatActivity {

    private TableLayout table;
    private ArrayList<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_personas);


        table = (TableLayout) findViewById(R.id.tblPersonas);
        personas = Datos.obtener();

        for (int i = 0; i < personas.size(); i++) {
            TableRow row = new TableRow(this);

            TextView num = new TextView(this);
            TextView id = new TextView(this);
            TextView name = new TextView(this);
            TextView lastName = new TextView(this);

            num.setText("" + (i +1));
            num.setGravity(Gravity.CENTER_HORIZONTAL);
            id.setText(personas.get(i).getIdentification().toString());
            name.setText(personas.get(i).getName().toString());
            lastName.setText(personas.get(i).getLastName().toString());

            row.addView(num);
            row.addView(id);
            row.addView(name);
            row.addView(lastName);

            table.addView(row);
        }
    }
}