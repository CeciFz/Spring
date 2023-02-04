package annotations;


import org.springframework.stereotype.Component;

@Component //Para registrar el bean en el contenedor de Spring
public class InformeFinanciero implements CreacionInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Presentación del informe financiero.";
    }

}
