package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroAnual implements CreacionInformeFinanciero {
    @Override
    public String getInformeFinanciero() {
        return "Informe financiero anual.";
    }
}
