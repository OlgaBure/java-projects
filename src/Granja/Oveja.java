package Granja;

import java.util.Arrays;

public class Oveja extends Animal {
    private int [] metrosLana;

    //metodo constructor-se encarga de dar un estado inicial a nuestro objeto.
    public Oveja(){//estado inicial del objeto construimos
        super();
        metrosLana = new int[15];
        for (int i = 0; i < metrosLana.length; i++) {
            metrosLana[i]=(int)(Math.random()*10);
        }
    }
    public Oveja(String nombre, int peso, int edad, int[] metrosLana) { //argumentos de entrada
        super(nombre,peso, edad);
        this.metrosLana=metrosLana;
    }
    public Oveja (String nombre, int peso, int edad){
        super(nombre,edad,peso);
        metrosLana = new int[15];
        for (int i = 0; i < metrosLana.length; i++) {
            metrosLana[i]=(int)(Math.random()*10);
        }
    }
    //GETTER Y SETTER
    public int[] getMetrosLana() {
        return metrosLana;
    }
    public void setMetrosLana(int []metrosLana) {
        this.metrosLana = metrosLana;
    }
    // TOsTRING
    @Override
    public String toString() {
        return super.toString() + " da al trimestre " + ;
    }

    public String toLanaOrdenada(){
        StringBuilder sb = new StringBuilder()
    }
}
