package co.com.bancolombia.modelos;

public class Cuadrado extends FiguraGeometrica {

    private Float lado;

    public Cuadrado(Float lado) {
        super();
        this.setArea(calcularArea(lado));
    }

    private Float calcularArea(Float lado) {
        return lado * lado;
    }

}
