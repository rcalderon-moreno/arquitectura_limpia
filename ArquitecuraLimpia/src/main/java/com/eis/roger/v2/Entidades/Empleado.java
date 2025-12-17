package com.eis.roger.v2.Entidades;

public class Empleado extends Persona {
    private String cargo;


    public Empleado(String nombres, String apellidos, String cargo) {
        super(nombres, apellidos);
        this.cargo = cargo;

    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}
