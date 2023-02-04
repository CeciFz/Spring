package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("annotations")
public class EmpleadosConfig {

    //Defino bean CreacionInformeFinancieroBean (que será inyectado)
    @Bean
    public CreacionInformeFinancieroBean informeFinancieroBean(){
        return new InformeFinancieroBean();
    }

    //Defino el bean para EmpleadoEjemploBean e inyecto dependencia
    @Bean
    public Empleado ejemploEmpleadoBean(){
        return new EmpleadoEjemploBean(informeFinancieroBean());
    }
}
