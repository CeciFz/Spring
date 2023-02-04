package xml;

public class JefeEmpleado implements Empleado {

    @Override
    public String getTareas() {
        return "Tareas Jefe";
    }

    @Override
    public String getInforme() {
        return null;
    }
}
