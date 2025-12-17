package com.eis.roger.v2.CasosDeUso.cu2;

public class EmpleadoOutPutActualizarCargoDTO {

    private  String informacionEmpleado;
    private  String mensajeEmpleado;

    public EmpleadoOutPutActualizarCargoDTO(String informacionEmpleado, String mensajeEmpleado) {
        this.informacionEmpleado = informacionEmpleado;
        this.mensajeEmpleado = mensajeEmpleado;
    }

    public String getInformacionEmpleado() {
        return informacionEmpleado;
    }

    public String getMensajeEmpleado() {
        return mensajeEmpleado;
    }
}
