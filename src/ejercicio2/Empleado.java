package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado extends Persona {
    public static int contador;
    ArrayList<Empleado> supervisados;
    private LocalDate fechaContrato;
    private double sueldoBruto;
    Empleado supervisor;

    public Empleado(LocalDate fechaNacimiento) {
        super(fechaNacimiento);
        this.supervisados = new ArrayList<>();
        this.fechaContrato = LocalDate.now();
        this.sueldoBruto = 15876;
        this.contador = this.contador + 1;
    }

    public void setNombreCompleto(String nombreCompleto) {
        String[] nombreApellidos = nombreCompleto.split(" ");
        nombre = nombreApellidos[0];
        apellido1 = nombreApellidos[1];
        apellido2 = nombreApellidos[2];
    }

    public String getNombreCompleto(){
        return apellido1 + " " + apellido2 + ", " +  nombre;
    }
    public void aumentarSueldo(double porcentaje){
        this.sueldoBruto = sueldoBruto + (sueldoBruto * porcentaje/100);
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    public void asignarSupervisor(Empleado empleado){
        this.supervisor = empleado;
    }
    public void asignarSupervisado(Empleado empleado){
        supervisados.add(empleado);
    }
    public void quitarSupervisado(Empleado empleado){
        supervisados.remove(empleado);
    }
    public void mostrarDatosEmpleados(){
        System.out.println(getNombreCompleto());
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Fecha de contrato: " + fechaContrato);
        System.out.printf("Sueldo: %.2f", sueldoBruto);
        System.out.println(" €");
        if (supervisor != null){
            System.out.println("Supervisado por: " + supervisor);
        }else{
            System.out.println("Supervisado por: nadie");
        }
        if (supervisados.isEmpty()){
            System.out.println("Supervisa a : nadie");
        } else {
            System.out.println("Supervisa a : " + supervisados.toString());
        }
        System.out.println();
    }

    public int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return apellido1 + " " + apellido2 + ", " +  nombre;
    }
}
