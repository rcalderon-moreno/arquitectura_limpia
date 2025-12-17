package com.eis.roger.v2.CasosDeUso.cu3;

import java.util.ArrayList;

public interface InterfazBaseDeDatos {

    public Boolean conectar();
    public Boolean desconectar();
    public ArrayList<String> consultar(String...parametros);
    public Boolean insertar(EmpleadoInputPersistirDTO empleado);


}
