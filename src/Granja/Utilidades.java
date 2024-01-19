package Granja;

public class Utilidades {
    //diccionario de los metodos y objetos
    public static final String [] nombres = {"Paco","Max", "Chacha", "Goku", "Moska"};
    public static String getNombreAleatorio(){
        return Utilidades.nombres[(int)(Math.random()*Utilidades.nombres.length)];
    }
}
