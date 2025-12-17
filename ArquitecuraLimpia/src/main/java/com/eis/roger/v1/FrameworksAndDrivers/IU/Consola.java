package com.eis.roger.v1.FrameworksAndDrivers.IU;

import com.eis.roger.v1.AdaptadoresDeInterfaz.Controladores.ControladorGestionAcademica;

public class Consola {
    private ControladorGestionAcademica controladorGestionAcademica;

    public Consola(){
        this.controladorGestionAcademica = new ControladorGestionAcademica();
    }

    public void inscribir(){
        if (this.controladorGestionAcademica.inscribirEstudianteEnPlataforma("A1","B1","P1"))
            System.out.println("Estudiante registrado exitosamente");
        else
            System.out.println("Estudiante no fue registrado");
    }

    public void  listadoInscritos(){
        System.out.println(this.controladorGestionAcademica.listadoEstudiantesInscritos());
    }



}
