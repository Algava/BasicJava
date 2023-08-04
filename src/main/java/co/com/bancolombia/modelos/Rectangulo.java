package co.com.bancolombia.modelos;

public class Rectangulo extends FiguraGeometrica {
    
    private Float ladoA;
    private Float ladoB;

    public Rectangulo(Float ladoA, Float ladoB) {
        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setArea(calcularArea());
    }

    public Float getLadoA() {
        return ladoA;
    }

    public void setLadoA(Float ladoA) {
        this.ladoA = ladoA;
    }

    public Float getLadoB() {
        return ladoB;
    }

    public void setLadoB(Float ladoB) {
        this.ladoB = ladoB;
    }
    
    private Float calcularArea() {
        return this.ladoA * this.ladoB;
    }
    
}
