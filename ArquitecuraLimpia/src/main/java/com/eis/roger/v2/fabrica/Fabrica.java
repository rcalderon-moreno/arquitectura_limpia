package com.eis.roger.v2.fabrica;

import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU1;
import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU2;
import com.eis.roger.v2.AdaptadoresDeInterfaz.Controladores.ControladorCU3;
import com.eis.roger.v2.CasosDeUso.cu1.InterfazSalidaCU1;
import com.eis.roger.v2.CasosDeUso.cu1.UseCaseInscribirEstudiante;
import com.eis.roger.v2.CasosDeUso.cu2.InterfazSalidaCU2;
import com.eis.roger.v2.CasosDeUso.cu2.UseCaseActualizarInformacionEmpleado;
import com.eis.roger.v2.CasosDeUso.cu3.EmpleadoDAO;
import com.eis.roger.v2.CasosDeUso.cu3.InterfazSalidaCU3;
import com.eis.roger.v2.CasosDeUso.cu3.UseCasePersistirInformacionEmpleado;
import com.eis.roger.v2.FrameworksAndDrivers.BD.BaseDatos;


public class Fabrica {

    private static EmpleadoDAO empleadoDAO=new EmpleadoDAO(new BaseDatos());

    private static UseCaseInscribirEstudiante useCaseInscribirEstudiante(){

        return UseCaseInscribirEstudiante.getInstance() ;
    }

    public static ControladorCU1 controladorCU1(){
        return new ControladorCU1(useCaseInscribirEstudiante());
    }
    public  static InterfazSalidaCU1 presentadorCU1(){

        return useCaseInscribirEstudiante().obtenerInterfazOutPut();
    }

    private static UseCaseActualizarInformacionEmpleado useCaseActualizarInformacionEmpleado () {
        return UseCaseActualizarInformacionEmpleado.getInstance() ;
    }

    public static ControladorCU2 controladoCU2() {
        return new ControladorCU2(UseCaseActualizarInformacionEmpleado.getInstance());
    }

    public  static InterfazSalidaCU2 presentadorCU2(){
       return UseCaseActualizarInformacionEmpleado.useCaseActualizarInformacionEmpleado.obtenerInterfazOutPut();
    }

    private static UseCasePersistirInformacionEmpleado useCasePersistirInformacionEmpleado(){
        return UseCasePersistirInformacionEmpleado.getInstance(empleadoDAO) ;
    }

    public static ControladorCU3 controladorCU3(){
        return new ControladorCU3(useCasePersistirInformacionEmpleado());

    }

    public  static InterfazSalidaCU3 presentadorCU3(){
        return useCasePersistirInformacionEmpleado().obtenerInterfazOutPut();
    }

}
