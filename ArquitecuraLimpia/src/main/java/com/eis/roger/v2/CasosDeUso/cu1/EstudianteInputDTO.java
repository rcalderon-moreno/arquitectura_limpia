package com.eis.roger.v2.CasosDeUso.cu1;

public class EstudianteInputDTO {
    private String nombres;
    private String apellidos;
    private String programaAcademico;
    public EstudianteInputDTO( String nombres, String apellidos, String programaAcademico){
         this.nombres = nombres;
         this.apellidos = apellidos;
         this.programaAcademico = programaAcademico;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }
}
