package com.eis.roger.v2.CasosDeUso.cu2;

public class EmpleadoInputActualizaCargoDTO {
    private String nombres;
    private String cargo;

    public EmpleadoInputActualizaCargoDTO(String nombres, String cargo) {
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
