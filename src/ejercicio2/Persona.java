package ejercicio2;

import java.time.LocalDate;

public abstract class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {

        return nombre + apellido1 + apellido2;
    }

    public void setNombreCompleto(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public void cambiarFechaDeNacimiento (int dd, int mm, int aaaa){
        fechaNacimiento = LocalDate.ofEpochDay(dd + mm + aaaa);
    }

}
