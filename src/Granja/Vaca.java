package Granja;
import java.util.Arrays;
public class Vaca extends Animal {
    /*1 Pensar en ATRIBUTOS.
    2.hacer getter y setter de los mismos atributos
    3.Pensar en hacer constructores, el vacio por defecto y el que permite inicializar los atributos.
    El constructor que se llama igual que la clase (respetando MAysc y minusc). Es especial porque
    no se indica de forma explicita lo que devuelve.
    4.Hacer el to String
    5.Ir a la clase MAin o tester para probarlo
    No generar las cosas automaticamente para aprenderlo.*/
    private float [] leche;
    public Vaca(){
        super();//atributos del clase padre
        //inicializas la leche
        leche = new float[7];
        for (int i = 0; i < leche.length; i++) {
            leche[i]= (float)(Math.random()*10);
        }
    }
    public Vaca (String nombre, int edad, float peso, float[] leche){
        super(nombre, edad, peso);
        this.leche=leche;
    }
    public Vaca (String nombre, int edad, float peso){
        super(nombre, edad, peso);
        leche = new float[7];
        for (int i = 0; i < leche.length; i++) {
            leche[i]= (float)(Math.random()*10);
        }
    }
    //--------------GETTER Y SETTER ------------------
    public float[] getLeche() {
        return leche;
    }
    public void setLeche(float[] leche){
        this.leche=leche;
    }
    public String toString (){
        return super.toString() + " pone la semana "+ toLecheFormateada();
    }
    public String toLecheFormateada(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < leche.length; i++) {
            sb.append(String.format("%.2f",leche[i])).append(" - ");
        }
        return sb.toString();
    }

}
