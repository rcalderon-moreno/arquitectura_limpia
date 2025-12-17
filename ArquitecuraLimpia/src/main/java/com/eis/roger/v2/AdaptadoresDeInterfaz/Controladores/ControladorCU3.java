package com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores;


import com.eis.roger.v2.CasosDeUso.cu3.EmpleadoInputPersistirDTO;
import com.eis.roger.v2.CasosDeUso.cu3.InterfazEntradaCU3;
import com.eis.roger.v2.CasosDeUso.cu3.UseCasePersistirInformacionEmpleado;

public class ControladorCU3 {


    private UseCasePersistirInformacionEmpleado useCasePersistirInformacionEmpleado;

    //public ControladorCU3(UseCasePersistirInformacionEmpleado useCasePersistirInformacionEmpleado) {
    public ControladorCU3(InterfazEntradaCU3 useCasePersistirInformacionEmpleado) {
        this.useCasePersistirInformacionEmpleado = (UseCasePersistirInformacionEmpleado) useCasePersistirInformacionEmpleado;
    }

    public void guardarInformacionBaseDatos(String nombres, String cargo) {

        EmpleadoInputPersistirDTO empleadoDTO=new EmpleadoInputPersistirDTO(nombres,cargo);
        this.useCasePersistirInformacionEmpleado.registrarEmpleado(empleadoDTO);
    }
}
