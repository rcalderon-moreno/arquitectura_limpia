package com.eis.roger.v2.CasosDeUso.cu3;

public class EmpleadoInputPersistirDTO {
    private String nombres;
    private String cargo;

    public EmpleadoInputPersistirDTO(String nombres, String cargo) {
        this.nombres = nombres;
        this.cargo = cargo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCargo() {
        return cargo;
    }
}
