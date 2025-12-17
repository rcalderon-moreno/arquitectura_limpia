package com.eis.roger.v2.FrameworksAndDrivers.Web;

import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU2;
import com.eis.roger.v2.CasosDeUso.cu2.EmpleadoInputActualizaCargoDTO;
import com.eis.roger.v2.CasosDeUso.cu2.InterfazSalidaCU2;
import com.eis.roger.v2.fabrica.Fabrica;

public class ServicioWeb {

    private  ControladorCU2 controladorCU2;
    private InterfazSalidaCU2 presentadorCU2;

    public ServicioWeb() {

        this.controladorCU2= Fabrica.controladoCU2();


    }

    public void actualizarInformacion(){

        this.controladorCU2.actualizarCargo(new EmpleadoInputActualizaCargoDTO("J5","Arquitecto de Software"));

    }

    public void mostrarInformacion(){
        this.presentadorCU2= Fabrica.presentadorCU2();
        System.out.println( this.presentadorCU2.informacionEmpleado().getInformacionEmpleado() );
        System.out.println( this.presentadorCU2.informacionEmpleado().getMensajeEmpleado() );
    }


}
