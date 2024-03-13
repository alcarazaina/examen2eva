package ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(LocalDate.of(2000, 3, 8));

        empleado1.setNombreCompleto("Mar Muro Tapia");
        Empleado empleado2 = new Empleado(LocalDate.of(1999, 10, 15));

        empleado2.setNombreCompleto("Nicolás Colás Colás");
        empleado2.setFechaContrato(LocalDate.of(2000, 03, 15));
        empleado2.aumentarSueldo(15);

        Empleado empleado3 = new Empleado(LocalDate.of(1978, 05, 05));
        empleado3.setNombreCompleto("Jon Juárez Jiménez");

        empleado3.asignarSupervisado(empleado1);
        empleado3.asignarSupervisado(empleado2);

        empleado1.asignarSupervisor(empleado3);
        empleado2.asignarSupervisor(empleado3);

        empleado1.mostrarDatosEmpleados();
        empleado2.mostrarDatosEmpleados();
        empleado3.mostrarDatosEmpleados();

        System.out.println("Nº de empleados: " + empleado1.getContador());
    }
}
