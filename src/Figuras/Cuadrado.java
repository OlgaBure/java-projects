package Figuras;

public class Cuadrado {
    private double lado;
    private Punto PuntoCentro;
    public Cuadrado(){

    }
    public Cuadrado(Punto PuntoCentro, double lado){
        PuntoCentro = new Punto(4, 8);
        lado = 4;
    }
    public Cuadrado(double lado1, double lado2, double lado3, double lado4, Punto PuntoCentro){
        lado1=4;
        lado2=10;
        lado3=4;
        lado4=10;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public Punto getPuntoCentro(){
        return PuntoCentro;
    }

    public double calcularPerimCuadrado(double lado){
        return PuntoCentro.calcularDistanciaDesde(PuntoCentro);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", PuntoCentro=" + PuntoCentro +
                '}';
    }
}
