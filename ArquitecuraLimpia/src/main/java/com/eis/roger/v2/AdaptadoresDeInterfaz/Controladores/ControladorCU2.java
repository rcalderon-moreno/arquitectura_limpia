package com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores;

import com.eis.roger.v2.CasosDeUso.cu2.EmpleadoInputActualizaCargoDTO;
import com.eis.roger.v2.CasosDeUso.cu2.InterfazEntradaCU2;
import com.eis.roger.v2.CasosDeUso.cu2.UseCaseActualizarInformacionEmpleado;

public class ControladorCU2 {


    private InterfazEntradaCU2 interfazEntradaCU2;
    private UseCaseActualizarInformacionEmpleado useCaseActualizarInformacionEmpleado;

    //public ControladorCU2(UseCaseActualizarInformacionEmpleado useCaseActualizarInformacionEmpleado){
    public ControladorCU2(InterfazEntradaCU2 useCaseActualizarInformacionEmpleado){


        this.useCaseActualizarInformacionEmpleado=(UseCaseActualizarInformacionEmpleado) useCaseActualizarInformacionEmpleado;

    }

    public void actualizarCargo(EmpleadoInputActualizaCargoDTO empleadoInputActualizaCargoDTO ){



        useCaseActualizarInformacionEmpleado.actualizarCargo(empleadoInputActualizaCargoDTO);

    }


}
