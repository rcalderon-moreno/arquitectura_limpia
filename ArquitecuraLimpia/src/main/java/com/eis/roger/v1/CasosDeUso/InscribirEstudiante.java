package com.eis.roger.v1.CasosDeUso;

import com.eis.roger.v1.Entidades.Estudiante;

import java.util.ArrayList;

public class InscribirEstudiante {

    private ArrayList<Estudiante> estudiantes;

    public InscribirEstudiante() {
        this.estudiantes = new ArrayList<>();
    }

    public Boolean inscribirEstudiante(String nombres, String apellidos, String programaAcademico) {

        Estudiante estudiante =new Estudiante(nombres,apellidos,programaAcademico);
        return  this.estudiantes.add(estudiante);
    }

    public String imprimirListadoEstudiantes() {

//        for (Estudiante estudiante : this.estudiantes) {
//            System.out.println(estudiante.toString());
//        }

        return estudiantes.toString();
    }

}
