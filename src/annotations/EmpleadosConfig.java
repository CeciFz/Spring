package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("annotations")
@PropertySource("classpath:datosEmpresaAnnotations.propiedades")
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
