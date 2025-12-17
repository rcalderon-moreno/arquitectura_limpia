package com.eis.roger.v2;

import com.eis.roger.v2.FrameworksAndDrivers.IU.Consola;
import com.eis.roger.v2.FrameworksAndDrivers.IU.Consola2;
import com.eis.roger.v2.FrameworksAndDrivers.Web.ServicioWeb;


public class Main {
    public static void main(String[] args) {
        /*
        Consola consola = new Consola();

        consola.inscribir();
        consola.inscribir();
        consola.inscribir();
        consola.listadoInscritos();
*/


/*
        ServicioWeb servicioWeb = new ServicioWeb();
        servicioWeb.actualizarInformacion();
        servicioWeb.mostrarInformacion();
*/

        Consola2 consola2 = new Consola2();
        consola2.registrarEmpleado();
        consola2.listadoEmpleados();

    }
}