package Figuras;

public class Triangulo {
    public double cat1;//punto
    public double cat2;
    public double hypot;

    private Triangulo(double cat1, double cat2, double hypot){
        this.cat1=cat1;
        this.cat2=cat2;
        this.hypot=hypot;
    }

    Triangulo(){
        cat1 = Math.random()*100;
        cat2 = Math.random()*100;
        hypot = Math.random()*100;
    }
    public Triangulo(double cat1, double cat2, double hypot, double otroCat1, double otroCat2, double otroHypot){
        otroCat1=5;
        otroCat2=6;
        otroHypot= 10;
    }

    public double getCat1() {
        return cat1;
    }

    public double getCat2() {
        return cat2;
    }

    public double getHypot() {
        return hypot;
    }


}
