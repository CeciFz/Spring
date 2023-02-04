package xml;

public class DirectorEmpleado implements Empleado {

    private CreacionInforme informeNuevo;  //Campo usando Composición para inyectar por constructor

    public DirectorEmpleado(CreacionInforme informeNuevo){  //Constructor para inyectar dependencia
        this.informeNuevo = informeNuevo;
    }
    @Override
    public String getTareas() {
        return "Tareas Director";
    }

    @Override
    public String getInforme() {
        return "Informe del director: " + informeNuevo.getInforme();  //Usa la dependecia del constructor
    }


}
