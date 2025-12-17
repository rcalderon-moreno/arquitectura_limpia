package com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores;

import com.eis.roger.v2.CasosDeUso.cu1.EstudianteInputDTO;
import com.eis.roger.v2.CasosDeUso.cu1.InterfazEntradaCU1;
import com.eis.roger.v2.CasosDeUso.cu1.UseCaseInscribirEstudiante;

public class ControladorCU1 {

    private InterfazEntradaCU1 inscribirEstudiante;
    private EstudianteInputDTO estudianteInputDTO;
    private UseCaseInscribirEstudiante estudianteUseCase;

    public ControladorCU1(UseCaseInscribirEstudiante useCaseInscribirEstudiante) {
       this.estudianteUseCase=useCaseInscribirEstudiante;
       this.inscribirEstudiante=useCaseInscribirEstudiante;

    }

    public Boolean inscribirEstudianteEnPlataforma(String nombres, String apellidos, String programaAcademico){

        this.estudianteInputDTO=new EstudianteInputDTO(nombres,apellidos,programaAcademico);

        return this.inscribirEstudiante.inscribirEstudiante(this.estudianteInputDTO);
    }




//    public String listadoEstudiantesInscritos(){
//        return  this.inscribirEstudiante.imprimirListadoEstudiantes();
//    }


}
