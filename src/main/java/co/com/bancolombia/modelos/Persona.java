package co.com.bancolombia.modelos;

import java.time.LocalDate;

public class Persona {

    public Persona(String nombre, Integer edad, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    private String nombre;
    private Integer edad;
    private LocalDate fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
    }

    public void mostrarPersona(Boolean mostrarEdad) {
        if (mostrarEdad) {
            System.out.println("Nombre: " + this.nombre + " Edad: " + this.edad);
        } else {
            mostrarPersona();
        }
    }

}
