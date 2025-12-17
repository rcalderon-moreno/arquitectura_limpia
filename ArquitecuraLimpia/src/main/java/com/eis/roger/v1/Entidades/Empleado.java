package com.eis.roger.v1.Entidades;

public class Empleado extends Persona {
    private String cargo;
    private String cargoAsignado;

    public Empleado(String nombres, String apellidos, String cargo) {
        super(nombres, apellidos);
        this.cargo = cargo;
        this.cargoAsignado = "";
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargoAsignado() {
        return cargoAsignado;
    }
    public void setCargoAsignado(String cargoAsignado) {
        this.cargoAsignado = cargoAsignado;
    }
    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}
