package com.eis.roger.v2.CasosDeUso.cu1;


import java.util.ArrayList;
import java.util.List;

public class InformacionSalienteCU1 implements InterfazSalidaCU1 {
    ArrayList<EstudianteOutPutDTO> listaEstudiantes;


    public InformacionSalienteCU1(ArrayList<EstudianteOutPutDTO> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String convertirTexto(String texto) {
        return texto.toUpperCase();
    }

    @Override
    public List<EstudianteOutPutDTO> listadoEstudiantes() {
        return this.listaEstudiantes;
    }
}
