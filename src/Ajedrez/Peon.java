package Ajedrez;

public class Peon extends Pieza{
    public Peon(){
        super();
    }
    public Peon(String color){
        super();
    }
    public boolean validarMovimiento(Movimiento movimiento){
        boolean respuesta = false;
        if (movimiento.esVertical() || movimiento.esHorizontal()) {
            respuesta = true;
        }
        return false;
    }
    public boolean pintarPieza(){
        return pintarPieza();
    }
}
