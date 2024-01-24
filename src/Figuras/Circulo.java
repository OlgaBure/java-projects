package Figuras;

public class Circulo {

    private Punto PuntoCentro;
    private double Radio;

    public Circulo(Punto puntoCentro, double radio) {
        Punto PuntoCentro = new Punto(2, 3);
        Radio = 1;
    }

    public Circulo(double x, double y, double radio) {
        PuntoCentro = new Punto(x, y);
        this.Radio = radio;
    }

    public Circulo() {

    }

    public double getRadio() {
        return Radio;
    }

    public Punto getPuntoCentro() {
        return PuntoCentro;
    }

    public double calcularDistanciaDesde(Punto otroPunto) {
        return PuntoCentro.calcularDistanciaDesde(otroPunto) - Radio;
    }

    @Override
    public String toString() {
        return "Figuras.Circulo{" + "PuntoCentro=" + PuntoCentro + ", Radio=" + Radio +
                '}';
    }
}


