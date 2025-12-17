package com.eis.roger.v2.CasosDeUso.cu3;


public class UseCasePersistirInformacionEmpleado implements InterfazEntradaCU3 {


    public static UseCasePersistirInformacionEmpleado useCasePersistirInformacionEmpleado;
    private EmpleadoDAO empleadoDAO;

    private UseCasePersistirInformacionEmpleado(EmpleadoDAO empleadoDAO){
        this.empleadoDAO = empleadoDAO;
    }
    public static UseCasePersistirInformacionEmpleado getInstance(EmpleadoDAO empleadoDAO) {
        if (useCasePersistirInformacionEmpleado==null)
            useCasePersistirInformacionEmpleado=new UseCasePersistirInformacionEmpleado(empleadoDAO);

        return useCasePersistirInformacionEmpleado;
    }
    private void persistirInformacion(EmpleadoInputPersistirDTO empleadoInputPersistirDTO){

        this.empleadoDAO.ingresarEmpleado(empleadoInputPersistirDTO);

    }

    @Override
    public Boolean registrarEmpleado(EmpleadoInputPersistirDTO empleadoInputPersistirDTO) {

        this.persistirInformacion(empleadoInputPersistirDTO);
        return true;
    }

    public InterfazSalidaCU3 obtenerInterfazOutPut(){

         return  new InformacionSalienteCU3( empleadoDAO.consultarEmpleado("Juan") );
    }

}
