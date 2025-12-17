package com.eis.roger.v2.CasosDeUso.cu2;


import com.eis.roger.v2.CasosDeUso.cu1.EstudianteOutPutDTO;

import java.util.ArrayList;

public class InformacionSalienteCU2  implements InterfazSalidaCU2  {


    private EmpleadoOutPutActualizarCargoDTO empleadoOutPutActualizarCargoDTO;

    public InformacionSalienteCU2(EmpleadoOutPutActualizarCargoDTO empleadoOutPutActualizarCargoDTO) {
        this.empleadoOutPutActualizarCargoDTO=empleadoOutPutActualizarCargoDTO;
    }

    @Override
    public EmpleadoOutPutActualizarCargoDTO informacionEmpleado() {
        return this.empleadoOutPutActualizarCargoDTO;
    }
}
