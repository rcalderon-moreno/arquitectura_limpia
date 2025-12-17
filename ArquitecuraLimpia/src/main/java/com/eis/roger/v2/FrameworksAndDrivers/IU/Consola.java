package com.eis.roger.v2.FrameworksAndDrivers.IU;

import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU1;
import com.eis.roger.v2.CasosDeUso.cu1.EstudianteOutPutDTO;
import com.eis.roger.v2.CasosDeUso.cu1.InterfazSalidaCU1;
import com.eis.roger.v2.fabrica.Fabrica;

public class Consola {
    private ControladorCU1 controladorGestionAcademica;
    private InterfazSalidaCU1 presentador;
    public Consola(){

        this.controladorGestionAcademica = Fabrica.controladorCU1() ;
        this.presentador=Fabrica.presentadorCU1();

    }





    public void inscribir(){
        if (this.controladorGestionAcademica.inscribirEstudianteEnPlataforma("aaa1","bbb1","P1"))
            System.out.println("Estudiante registrado exitosamente");
        else
            System.out.println("Estudiante no fue registrado");
    }

    public void  listadoInscritos(){

        System.out.println("Listado de Inscritos en Estudiante ");
        for (EstudianteOutPutDTO estudianteOutPutDTO: this.presentador.listadoEstudiantes()){
           System.out.println( this.presentador.convertirTexto(estudianteOutPutDTO.getInformacion()) );
        }

    }



}
