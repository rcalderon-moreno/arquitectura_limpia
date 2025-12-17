package com.eis.roger.v2.Entidades;

public class Persona {
    protected String nombres;
    protected String apellidos;
    
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String toString() {
        return "Nombres: " + nombres + ", Apellidos: " + apellidos;
    }
    
    public String informe() {
        return toString();
    }
}