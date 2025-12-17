package com.eis.roger.v1.AdaptadoresDeInterfaz.Controladores;

import com.eis.roger.v1.CasosDeUso.InscribirEstudiante;

public class ControladorGestionAcademica {
    private InscribirEstudiante inscribirEstudiante;

    public ControladorGestionAcademica() {
        this.inscribirEstudiante = new InscribirEstudiante();
    }

    public Boolean inscribirEstudianteEnPlataforma(String nombres, String apellidos, String programaAcademico){
        return this.inscribirEstudiante.inscribirEstudiante(nombres, apellidos, programaAcademico);
    }

    public String listadoEstudiantesInscritos(){
        return  this.inscribirEstudiante.imprimirListadoEstudiantes();
    }


}
