package Granja;

import java.util.Arrays;

public class Cerdo extends Animal{
    private double[] carne;

    public Cerdo(){
        super();
        //inicializar la carne
        carne= new double[20];
        for (int i = 0; i < carne.length; i++) {
            carne[i]=(double)(Math.random()*10);
        }
    }
    public Cerdo(String nombre, int edad, float peso, double[]carne){
        super(nombre, edad, peso);
        this.carne=carne;
    }
    public Cerdo (String nombre, int edad, float peso){
        super(nombre, edad, peso);
        carne= new double[20];
        for (int i = 0; i < carne.length; i++) {
            carne[i]=(double)(Math.random()*10);
        }
    }

    @Override
    public double media() {
        return 0;
    }

    //GETTER Y SETTER
    public double[] getCarne(){
        return carne;
    }
    public void setCarne(double[] carne){
        this.carne=carne;
    }
    public String toString(){
        return super.toString() + String.format("crece al año \n %s ", Arrays.toString(carne));
    }
    /*
     @Override
    public String toString() {
        return "Cerdo{" +
                "carne=" + Arrays.toString(carne) +
                '}';
    }
     */
}
