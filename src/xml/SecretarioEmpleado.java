package xml;

public class SecretarioEmpleado implements Empleado{

    //Para inyectar campos email y nombreEmpresa
    private String email;
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }


    //Campo usando Composición para inyectar por setter
    private CreacionInforme informeNuevo;

    public void setInformeNuevo(CreacionInforme informeNuevo) {  // Inyecto la dependecia por setter.
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Tareas Secretario";
    }

    @Override
    public String getInforme() {
        return "Informe del secretario: " + informeNuevo.getInforme();
    }
}
