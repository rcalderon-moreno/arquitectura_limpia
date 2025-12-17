package com.eis.roger.v2.CasosDeUso.cu3;

public class EmpleadoOutPutPersistirDTO {

    private  String informacionEmpleado;
    private  String mensajeEmpleado;

    public EmpleadoOutPutPersistirDTO(String informacionEmpleado, String mensajeEmpleado) {
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
