package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // 1) Leer xml de configuración
        //Para que lea la configuración del xml
        // ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
        //Para que lea la configuración de la clase java de configuración
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        // 2) Pedir un bean al contenedor
        Empleado comercial = contexto.getBean("Comercial", Empleado.class); //Pide ID de @Component y la interfaz
        Empleado comprador = contexto.getBean("compras", Empleado.class);

        //Empleado con BEAN
        Empleado bean = contexto.getBean("ejemploEmpleadoBean", Empleado.class); //Pide nombre metodo del bean e interfaz
        EmpleadoEjemploBean bean2 = contexto.getBean("ejemploEmpleadoBean", EmpleadoEjemploBean.class);  //Para poder pedir el value



        // 3) Usar el bean
        System.out.println(comercial.getTareas());
        System.out.println(comercial.getInforme());
        System.out.println(" ");

        System.out.println(comprador.getTareas());
        System.out.println(comprador.getInforme());
        System.out.println(" ");

        System.out.println(bean.getTareas());
        System.out.println(bean.getInforme());
        System.out.println(" ");

        System.out.println(bean2.getNombreEmpresa());

        // 4) Cerrar el contexto
        contexto.close();
    }
}
