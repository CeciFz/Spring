package annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroBean implements CreacionInformeFinancieroBean {
    @Override
    public String getInformeFinanciero() {
        return "Informe financiero Bean.";
    }
}
