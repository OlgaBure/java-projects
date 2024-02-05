package Granja;

import java.util.Arrays;

public class Gallina extends Animal{
    private int[] huevosSemana;
    //----------------------------
    public Gallina (){
        super();
        huevosSemana=new int[5];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]=(int)(Math.random()*10);
        }
    }
    public Gallina (String nombre, int edad, float peso, int[]huevosSemana){
        super(nombre, edad, peso);
        this.huevosSemana=huevosSemana;
    }
    public Gallina (String nombre, int edad, float peso){
        super(nombre, edad, peso);
        huevosSemana=new int[5];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i]=(int)(Math.random()*10);
        }
    }

    @Override
    public double media() {
        return 0;
    }

    //GETTER Y SETTER
    public int[]getHuevosSemana(){
        return huevosSemana;
    }
    public void setHuevosSemana(int[]huevosSemana){
        this.huevosSemana=huevosSemana;
    }
    public String toString(){
        return super.toString()+", en la granja la gallina pone " + Arrays.toString(huevosSemana) + "huevos a la semana.";
    }

}
