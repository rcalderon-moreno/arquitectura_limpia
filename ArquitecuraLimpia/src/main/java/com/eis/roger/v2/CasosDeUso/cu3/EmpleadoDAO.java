package com.eis.roger.v2.CasosDeUso.cu3;

import java.util.ArrayList;

public class EmpleadoDAO {

    private  InterfazBaseDeDatos accesoBaseDeDatos;

    public EmpleadoDAO(InterfazBaseDeDatos accesoBaseDeDatos) {
        this.accesoBaseDeDatos = accesoBaseDeDatos;
        this.accesoBaseDeDatos.conectar();
    }

    public Boolean ingresarEmpleado(EmpleadoInputPersistirDTO empleado){
        return this.accesoBaseDeDatos.insertar(empleado);
    }

    public ArrayList<String> consultarEmpleado(String nombre){
        return this.accesoBaseDeDatos.consultar(nombre);
    }

}
