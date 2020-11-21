package com.example.personas;

import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPersona extends BaseAdapter {
    private Context contexto;
    private ArrayList<Persona> personas;
    private Resources res;

    public AdaptadorPersona(Context contexto, ArrayList<Persona> personas){
        this.contexto = contexto;
        this.personas = personas;
    }

    @Override
    public int getCount() {
        return personas.size();
    }

    @Override
    public Object getItem(int position) {
        return personas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        res = contexto.getResources();
        View v = convertView;

        LayoutInflater inf = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.item_persona,null);

        ImageView foto = v.findViewById(R.id.imgFoto);
        TextView cedula = v.findViewById(R.id.lblCedulaP);
        TextView nombre = v.findViewById(R.id.lblNombreP);
        TextView apellido = v.findViewById(R.id.lblApellidoP);

        Persona p = personas.get(position);

        foto.setImageDrawable(res.getDrawable(p.getPhoto()));
        cedula.setText(p.getIdentification());
        nombre.setText(p.getName());
        apellido.setText(p.getLastName());

        return v;
    }
}
