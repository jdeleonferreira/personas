package com.example.personas;

import android.graphics.drawable.Drawable;

public class Persona {
    private String identification;
    private String name;
    private String lastName;
    private int photo;

    public Persona(String identification, String name, String lastName, int photo) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.photo = photo;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoto(){ return photo; }
    public void setPhoto(int photo){ this.photo = photo; }

    public void save(){
        Datos.guardar(this);
    }
}
