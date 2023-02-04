package annotations;

import org.springframework.beans.factory.annotation.Value;

public class EmpleadoEjemploBean implements Empleado {
    @Override
    public String getTareas() {
        return "Tareas ejemplo BEAN";
    }

    @Override
    public String getInforme() {
        return nuevoInforme.getInformeFinanciero();
    }

    private CreacionInformeFinancieroBean nuevoInforme;

    public EmpleadoEjemploBean(CreacionInformeFinancieroBean nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    @Value("${nombre}")
    private String nombreEmpresa;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

}
