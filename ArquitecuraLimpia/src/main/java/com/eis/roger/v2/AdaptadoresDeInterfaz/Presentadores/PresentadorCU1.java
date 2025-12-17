package com.eis.roger.v2.AdaptadoresDeInterfaz.Presentadores;

import com.eis.roger.v2.CasosDeUso.cu1.EstudianteOutPutDTO;
import com.eis.roger.v2.CasosDeUso.cu1.InterfazSalidaCU1;

import java.util.List;

public class PresentadorCU1 implements InterfazSalidaCU1 {

    EstudianteOutPutDTO estudiante;



    @Override
    public String convertirTexto(String texto) {
        return "";
    }

    @Override
    public List<EstudianteOutPutDTO> listadoEstudiantes() {
        return List.of();
    }
}
