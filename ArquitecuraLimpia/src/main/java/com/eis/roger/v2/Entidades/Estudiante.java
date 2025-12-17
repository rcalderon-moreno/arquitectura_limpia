package com.eis.roger.v2.Entidades;

public class Estudiante extends Persona {
    private String programaAcademico;

    public Estudiante(String nombres, String apellidos, String programaAcademico) {
        super(nombres, apellidos);
        this.programaAcademico = programaAcademico;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }
    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }
    @Override
    public String toString() {
        return super.toString() + ", Programa Academico: " + programaAcademico;
    }
    
}
