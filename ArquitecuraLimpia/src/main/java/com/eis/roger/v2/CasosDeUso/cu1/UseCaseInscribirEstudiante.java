package com.eis.roger.v2.CasosDeUso.cu1;

import com.eis.roger.v2.Entidades.Estudiante;

import java.util.ArrayList;

public class UseCaseInscribirEstudiante implements InterfazEntradaCU1 {




    private ArrayList<Estudiante> estudiantes;
    private ArrayList<EstudianteOutPutDTO> listaEstudiantes;

    public static UseCaseInscribirEstudiante useCaseInscribirEstudiante;
    private UseCaseInscribirEstudiante() {
        this.estudiantes = new ArrayList<>();
        this.listaEstudiantes=new ArrayList<>();
    }

    public static UseCaseInscribirEstudiante getInstance() {
        if (useCaseInscribirEstudiante==null)
            useCaseInscribirEstudiante=new UseCaseInscribirEstudiante();

        return useCaseInscribirEstudiante;
    }


    @Override
    public Boolean inscribirEstudiante(EstudianteInputDTO estudianteInputDTO) {
        Estudiante estudiante =new Estudiante(estudianteInputDTO.getNombres(),estudianteInputDTO.getApellidos(), estudianteInputDTO.getProgramaAcademico());

        EstudianteOutPutDTO  estudianteOutPutDTO=new EstudianteOutPutDTO(estudianteInputDTO.getNombres()+" "+estudianteInputDTO.getApellidos()+" "+estudianteInputDTO.getProgramaAcademico());

        this.estudiantes.add(estudiante);
        this.listaEstudiantes.add(estudianteOutPutDTO);

        return  true;
    }

   public InterfazSalidaCU1 obtenerInterfazOutPut(){
        return  new InformacionSalienteCU1(this.listaEstudiantes);
    }


}
