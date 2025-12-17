package com.eis.roger.v2.CasosDeUso.cu2;

import com.eis.roger.v2.CasosDeUso.cu1.InformacionSalienteCU1;
import com.eis.roger.v2.CasosDeUso.cu1.InterfazSalidaCU1;
import com.eis.roger.v2.CasosDeUso.cu1.UseCaseInscribirEstudiante;
import com.eis.roger.v2.Entidades.Empleado;


import java.util.ArrayList;

public class UseCaseActualizarInformacionEmpleado implements InterfazEntradaCU2 {

    private ArrayList<Empleado> listadoEmpleados;
    private EmpleadoOutPutActualizarCargoDTO empleadoOutPutActualizarCargoDTO;

    public UseCaseActualizarInformacionEmpleado(){
        this.listadoEmpleados=new ArrayList<>();
        this.cargarListadoEmpleado();
    }



    public static UseCaseActualizarInformacionEmpleado useCaseActualizarInformacionEmpleado;


    public static UseCaseActualizarInformacionEmpleado getInstance() {
        if (useCaseActualizarInformacionEmpleado==null)
            useCaseActualizarInformacionEmpleado=new UseCaseActualizarInformacionEmpleado();

        return useCaseActualizarInformacionEmpleado;
    }





    private void cargarListadoEmpleado(){
        for(int i=0;i<10;i++){
            listadoEmpleados.add(new Empleado("J"+i,"C"+i, "D"));
        }

    }

    private void actualizarCargoEmpleado(EmpleadoInputActualizaCargoDTO empleadoActualizaCargoDTO){
        for (Empleado listadoEmpleado : listadoEmpleados) {
         //   System.out.println("listadoEmpleado " + listadoEmpleado.getNombres() );
            if (listadoEmpleado.getNombres().equals(empleadoActualizaCargoDTO.getNombres() )) {

                listadoEmpleado.setCargo(empleadoActualizaCargoDTO.getNombres());
                empleadoOutPutActualizarCargoDTO=new EmpleadoOutPutActualizarCargoDTO(empleadoActualizaCargoDTO.getNombres()
                        +" "+empleadoActualizaCargoDTO.getCargo(),"Información encontrada!");
                break;
            }

            empleadoOutPutActualizarCargoDTO=new EmpleadoOutPutActualizarCargoDTO(empleadoActualizaCargoDTO.getNombres()
                    +" "+empleadoActualizaCargoDTO.getCargo(),"Información no encontrada!");
        }

    }


    @Override
    public Boolean actualizarCargo(EmpleadoInputActualizaCargoDTO empleadoInputActualizaCargoDTO) {
        this.actualizarCargoEmpleado(empleadoInputActualizaCargoDTO);
        return true;
    }


    public InterfazSalidaCU2 obtenerInterfazOutPut(){
        return  new InformacionSalienteCU2(this.empleadoOutPutActualizarCargoDTO);
    }
}
