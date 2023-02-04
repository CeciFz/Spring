package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Compras implements Empleado {
    @Override
    public String getTareas() {
        return "Tareas compras: comprar";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }


    // Creando inyección dependencia con setter
    CreacionInformeFinanciero informeFinanciero;

    @Autowired // Tmb puedo evitar este seter y agregar el Autowired a la declaración del atributo informeFinanciero directamente.
    @Qualifier("informeFinancieroAnual")
    public void setInformeFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }


    /// Probando @PostConstruct y @PreDestroy

    @PostConstruct
    public void metodoInicial(){
        System.out.println("Se está ejecutando el método init en compras.");
    }

    @PreDestroy
    public void metodoFinal(){
        System.out.println("Se está ejecutando el método destroy en compras.");
    }
}
