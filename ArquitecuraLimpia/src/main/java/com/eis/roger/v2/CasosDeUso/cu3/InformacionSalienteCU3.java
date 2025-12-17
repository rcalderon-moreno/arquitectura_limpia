package com.eis.roger.v2.CasosDeUso.cu3;

import java.util.ArrayList;

public class InformacionSalienteCU3 implements InterfazSalidaCU3{

    private EmpleadoOutPutPersistirDTO empleadoOutPutPersistirDTO;
    private ArrayList<String> listado;



    public InformacionSalienteCU3(ArrayList<String> listado) {
        this.listado = listado;
    }


    @Override
    public ArrayList<String> listadoEmpleados() {

        return listado;
    }
}
