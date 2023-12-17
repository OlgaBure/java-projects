import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        //inicializacion y creacion de los variables
        Scanner read = new Scanner(System.in);
        int planta = 0;
        int plantaSolicitada = 0;
        boolean exit = false;
        int opcion = 0;

        //inicializacion del programa
        System.out.println("Hola! Bienvenido al ascensor." +
                "Tienes la opcion de: A:Subir; B: Bajar; C: Mostrar en que plantaestas;" +
                "D: resetear la planta al inicio; E: Enseñar toda la ruta; F: Salir");
        opcion = (char)System.in.read();

        while(!exit){

        }
        System.out.println("Introduce la planta a la que quiere subir?");
    }
}