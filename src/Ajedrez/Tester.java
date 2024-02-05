package Ajedrez;

import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion();
        Jugada jugada = new Jugada();

        tablero.pintarTablero();
        //bucle to do .... while mientras movimiento sea null
        System.out.println("Empezamos. Introduce tu jugada!");
        String jugadaUsuario = read.nextLine();
        Movimiento movimiento = jugada.movimientoJugada(jugadaUsuario.toUpperCase());


    }
}
