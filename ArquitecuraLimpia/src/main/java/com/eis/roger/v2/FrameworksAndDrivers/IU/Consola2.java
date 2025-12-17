package com.eis.roger.v2.FrameworksAndDrivers.IU;

import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU3;

import com.eis.roger.v2.CasosDeUso.cu3.EmpleadoOutPutPersistirDTO;
import com.eis.roger.v2.CasosDeUso.cu3.InterfazSalidaCU3;
import com.eis.roger.v2.fabrica.Fabrica;

public class Consola2 {

    private ControladorCU3 controladorCU3;
    private InterfazSalidaCU3 presentador3;

    public Consola2() {
        this.controladorCU3= Fabrica.controladorCU3();
        this.presentador3 =Fabrica.presentadorCU3();
    }

    public void  registrarEmpleado(){

        controladorCU3.guardarInformacionBaseDatos("Juan","Desarrollador");
        controladorCU3.guardarInformacionBaseDatos("Pedro","Desarrollador");
        controladorCU3.guardarInformacionBaseDatos("Carlos","DBA");


    }

    public void listadoEmpleados(){
        System.out.println("Listado de Empleados ");
        for (String empleado: this.presentador3.listadoEmpleados()){
            System.out.println( empleado );
        }
    }




}
