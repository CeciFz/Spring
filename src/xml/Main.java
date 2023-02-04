package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class    Main {
    public static void main(String[] args) {

        //Con clases:
        /*Empleado empleado = new DirectorEmpleado();
        System.out.println(empleado.getTareas());*/

        //Con Spring
        // 1) Cargo el archivo xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2) Pido el bean
        Empleado director = contexto.getBean("miEmpleado", Empleado.class); //Pide alias y la interfaz
        Empleado director2 = contexto.getBean("miEmpleado", Empleado.class); //Pide alias y la interfaz

        /* Si quiero un objeto del bean, pero desde su interface (Empleados) solos nos da acceso a los métodos de la
           interfaz, por lo que si quiero que me traiga métodos propios de la clase SecretarioEmpleado voy a tener
           que pedirle al bean el objeto secetario desde la clase SecretarioEmpleado */
        SecretarioEmpleado secretario = contexto.getBean("miSecretario", SecretarioEmpleado.class);
        SecretarioEmpleado secretario2 = contexto.getBean("miSecretario", SecretarioEmpleado.class);

        System.out.println(director.getTareas());
        System.out.println(director.getInforme());
        System.out.println(" ");


        System.out.println(secretario.getTareas());
        System.out.println(secretario.getInforme());
        System.out.println("Email: " + secretario.getEmail());
        System.out.println("Nombre empresa: " + secretario.getNombreEmpresa());
        System.out.println(" ");

        System.out.println("Probando scopes: ");
        System.out.println("Director 1: " + director);
        System.out.println("Director 2: " + director2);
        System.out.println(" ");
        System.out.println("Secretario 1: " + secretario);
        System.out.println("Secretario 2: " + secretario2);


        // 3) Cierro contexto
        contexto.close();

    }
}