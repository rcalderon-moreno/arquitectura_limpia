package com.eis.roger.v2.FrameworksAndDrivers.BD;

import com.eis.roger.v2.CasosDeUso.cu3.EmpleadoInputPersistirDTO;
import com.eis.roger.v2.CasosDeUso.cu3.InterfazBaseDeDatos;

import java.util.ArrayList;

public class BaseDatos implements InterfazBaseDeDatos {
    private ArrayList<String> resultado = new ArrayList<>();

    public BaseDatos() {
        resultado.add("Select * from Empleado where ...");
    }

    @Override
    public Boolean conectar() {
        return false;
    }

    @Override
    public Boolean desconectar() {
        return true;
    }

    @Override
    public ArrayList<String> consultar(String... parametros) {

        return resultado;
    }

    @Override
    public Boolean insertar(EmpleadoInputPersistirDTO empleado) {
        resultado.add(empleado.getNombres() + " " + empleado.getCargo());
        System.out.println("Insertar Empleado: " + empleado.getNombres() + " " + empleado.getCargo() );
        return true;
    }
}
