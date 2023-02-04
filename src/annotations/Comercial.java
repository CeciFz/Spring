package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Entre () va el ID que le quiero dar a este bean.
// Si no coloco nada, por default usa el nombre de la clase aunque con la primera letra en minúscula.
@Component("Comercial")
public class Comercial implements Empleado{
    @Override
    public String getTareas() {
        return "Tareas comercial: vender";
    }

    @Override
    public String getInforme() {
        //return "Informe del comercial";
        return informeFinanciero.getInformeFinanciero();
    }


    // Creando inyección dependencia con constructor
    CreacionInformeFinanciero informeFinanciero;

    @Autowired //Si solo tengo un constructor no es obligatorio colocarlo y la reconoce igual.
    public Comercial(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }
}
