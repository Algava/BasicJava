package co.com.bancolombia;

import co.com.bancolombia.modelos.Cuadrado;
import co.com.bancolombia.modelos.Persona;
import co.com.bancolombia.modelos.Rectangulo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        Persona persona1 = new Persona("Alejandro", 26, LocalDate.of(1996, 8, 16));
//
//        persona1.mostrarPersona();
//        persona1.mostrarPersona(Boolean.FALSE);

        Cuadrado cuadrado = new Cuadrado(5.0F);
        System.out.println(cuadrado.getArea());

        Rectangulo rectangulo = new Rectangulo(4F, 3F);
        System.out.println(rectangulo.getArea());
    }

}